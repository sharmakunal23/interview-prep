# SQL Practice (PostgreSQL 17)

Commands:
```bash
# Start the database on docker
cd core-skills/sql
scripts/start.sh
```

```bash
# Connect to database
scripts/connect.sh
```

```sql
-- List all tables
\dt

-- Describe table structure
\d table_name

-- Clear screen
\! clear

-- Exit
\q

-- Execute file
\i /problems/your-problem/schema.sql

-- Show current database
SELECT current_database();

-- Show query execution plan
EXPLAIN ANALYZE SELECT * FROM your_table;
```
```bash
# Stop database
scripts/stop.sh
```