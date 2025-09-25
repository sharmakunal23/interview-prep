#!/usr/bin/env bash
set -euo pipefail
if [ "$#" -lt 1 ]; then
  echo "Usage: $0 <slug>"; exit 1
fi
slug="$1"
base="problems/$slug"
mkdir -p "$base/results"
cat > "$base/schema.sql" <<'SQL'
-- Define tables here as per LeetCode statement.
SQL
cat > "$base/seed.sql" <<'SQL'
-- Insert sample data here (start with LeetCode samples).
SQL
cat > "$base/solution.sql" <<'SQL'
/*
Title: <Problem Title> (LC ####)
Approach: <brief>
Complexity: depends on indexes; aim for O(n) scans with appropriate joins.
*/
-- Write your final SELECT query below.
SQL
cat > "$base/verify.sql" <<'SQL'
-- Optional: write checks that return 1 row with "ok = 1" when correct.
-- Example:
-- WITH res AS (... your solution ...)
-- SELECT CASE WHEN COUNT(*) = <expected> THEN 1 ELSE 0 END AS ok FROM res;
SQL
touch "$base/scale.sql"
echo "Scaffolded SQL problem at $base"
