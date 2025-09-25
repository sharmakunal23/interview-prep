#!/usr/bin/env bash
set -euo pipefail
if [ "$#" -lt 1 ]; then echo "Usage: $0 <slug>"; exit 1; fi
slug="$1"; base="problems/$slug"
export $(grep -v '^#' .env | xargs)
docker compose exec -T postgres psql -U ${POSTGRES_USER} -d ${POSTGRES_DB} -v ON_ERROR_STOP=1 -P pager=off -f "$base/schema.sql" -f "$base/seed.sql" -f "$base/verify.sql"
