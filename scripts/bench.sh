#!/usr/bin/env bash
set -euo pipefail
PROFILE=${PROFILE:-bench}
CLASS=${CLASS:-TwoSumBenchmark}
FMT=${FMT:-csv}
OUT=${OUT:-jmh/results/${CLASS}.csv}

mvn -q -P${PROFILE} clean install
java -jar target/benchmarks.jar ${CLASS} -rf ${FMT} -rff ${OUT}
echo "Saved -> ${OUT}"
