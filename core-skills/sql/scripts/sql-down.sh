#!/usr/bin/env bash
set -euo pipefail
docker compose down -v
echo "Postgres stopped and volumes removed."
