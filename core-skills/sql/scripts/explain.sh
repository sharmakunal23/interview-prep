#!/usr/bin/env bash
set -euo pipefail
if [ "$#" -lt 1 ]; then echo "Usage: $0 <slug>"; exit 1; fi
slug="$1"
export $(grep -v '^#' .env | xargs)
base="problems/$slug"
json="$base/results/explain.json"
txt="$base/results/explain.txt"

tmp_sql="$(mktemp)"
cat "$base/schema.sql" "$base/seed.sql" > "$tmp_sql"
{
  echo "EXPLAIN (ANALYZE, BUFFERS, TIMING, VERBOSE, FORMAT JSON)"
  echo "WITH solution AS ("
  cat "$base/solution.sql"
  echo ") SELECT * FROM solution;"
} >> "$tmp_sql"

docker compose exec -T postgres psql -U ${POSTGRES_USER} -d ${POSTGRES_DB} -v ON_ERROR_STOP=1 -P pager=off -f "$tmp_sql" -A -F $'\t' -P format=unaligned > "$json" || true

# Pretty text explain
tmp_sql2="$(mktemp)"
cat "$base/schema.sql" "$base/seed.sql" > "$tmp_sql2"
{
  echo "EXPLAIN (ANALYZE, BUFFERS, VERBOSE)"
  echo "WITH solution AS ("
  cat "$base/solution.sql"
  echo ") SELECT * FROM solution;"
} >> "$tmp_sql2"
docker compose exec -T postgres psql -U ${POSTGRES_USER} -d ${POSTGRES_DB} -v ON_ERROR_STOP=1 -P pager=off -f "$tmp_sql2" > "$txt" || true

echo "Explain saved -> $json and $txt"
