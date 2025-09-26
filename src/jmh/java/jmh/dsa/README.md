# JMH Benchmarks (Java 11)

#### Build the fat jar
```bash
mvn -q -DskipTests clean package
```

#### Run (use FQCN or a regex)

```bash
# Fully-qualified class name
java -jar target/benchmarks.jar jmh.dsa.arrays.TwoSumBenchmark \
  -rf csv -rff jmh/results/two-sum.csv

# Or by simple name / regex
java -jar target/benchmarks.jar TwoSumBenchmark
```

