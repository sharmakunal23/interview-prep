-- Duplicate current rows 10x to grow table size; adjust as needed.
DO $$
DECLARE
  cur_count BIGINT;
BEGIN
  SELECT COUNT(*) INTO cur_count FROM Employee;
  IF cur_count = 0 THEN
    RAISE NOTICE 'Seed data first before scaling.';
    RETURN;
  END IF;
  INSERT INTO Employee (id, name, salary, managerId)
  SELECT e.id + 1000000*g.s, e.name || '_' || g.s, e.salary + (g.s % 1000),
         CASE WHEN e.managerId IS NULL THEN NULL ELSE e.managerId + 1000000*g.s END
  FROM Employee e CROSS JOIN generate_series(1,10) g(s);
END$$;
