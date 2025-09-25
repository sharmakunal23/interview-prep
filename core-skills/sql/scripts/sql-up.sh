#!/usr/bin/env bash
set -euo pipefail
export $(grep -v '^#' .env | xargs)
docker compose up -d postgres
echo "Postgres 17 running at localhost:${POSTGRES_PORT}, DB=${POSTGRES_DB}"
