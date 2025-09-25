package jmh.dsa.arrays;

import dsa.arrays.TwoSum;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 5, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@Fork(value = 2)
public class TwoSumBenchmark {

    @State(Scope.Thread)
    public static class InputState {
        @Param({"100", "10000", "200000"})
        public int n;

        @Param({"1000"})
        public int samples;

        private int[][] arrays;
        private int[] targets;
        private int cursor;
        private final Random rnd = new Random(12345);
        private final TwoSum twoSum = new TwoSum();

        @Setup(Level.Trial)
        public void setup() {
            arrays = new int[samples][];
            targets = new int[samples];
            for (int s = 0; s < samples; s++) {
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = rnd.nextInt(1_000_000) - 500_000;
                int i = rnd.nextInt(n);
                int j = (i + 1 + rnd.nextInt(Math.max(1, n - 1))) % n;
                int x = rnd.nextInt(1000);
                a[i] = x;
                a[j] = 42;
                arrays[s] = a;
                targets[s] = x + 42;
            }
        }

        int[] nextArray() {
            int idx = cursor++;
            if (cursor == samples) cursor = 0;
            return arrays[idx];
        }

        int nextTarget() {
            int idx = (cursor == 0 ? samples - 1 : cursor - 1);
            return targets[idx];
        }
    }

    @Benchmark
    public void twoSumThroughput(InputState st, Blackhole bh) {
        int[] nums = st.nextArray();
        int target = st.nextTarget();
        int[] ans = st.twoSum.hashMapSolution(nums, target);
        bh.consume(ans);
    }
}
