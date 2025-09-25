#!/usr/bin/env bash
set -euo pipefail
export $(grep -v '^#' .env | xargs)
docker compose exec postgres psql -U ${POSTGRES_USER} -d ${POSTGRES_DB}
