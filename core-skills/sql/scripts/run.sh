#!/usr/bin/env bash
set -euo pipefail
if [ "$#" -lt 1 ]; then echo "Usage: $0 <slug>"; exit 1; fi
slug="$1"
export $(grep -v '^#' .env | xargs)
base="problems/$slug"
out="$base/results/output.csv"
cat "$base/schema.sql" "$base/seed.sql" "$base/solution.sql" | docker compose exec -T postgres psql -U ${POSTGRES_USER} -d ${POSTGRES_DB} -v ON_ERROR_STOP=1 -F',' --no-align -t -P footer=off > "$out"
echo "Result saved -> $out"
