#!/bin/bash
docker-compose up -d
echo "PostgreSQL started at localhost:5432"
echo "pgAdmin available at http://localhost:8080"
echo "  Email: admin@admin.com"
echo "  Password: admin"