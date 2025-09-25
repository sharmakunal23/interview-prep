# JMH Benchmarks

## Run
```bash
mvn -q -Pbench clean install
java -jar target/benchmarks.jar TwoSumBenchmark -rf csv -rff jmh/results/two-sum.csv
```
