#!/usr/bin/env bash
set -euo pipefail
if [ "$#" -lt 2 ]; then echo "Usage: $0 <slug> <target_rows_hint>"; exit 1; fi
slug="$1"; target="$2"; base="problems/$slug"
export $(grep -v '^#' .env | xargs)
docker compose exec -T postgres psql -U ${POSTGRES_USER} -d ${POSTGRES_DB} -v ON_ERROR_STOP=1 -v target="$target" -P pager=off -f "$base/scale.sql"
