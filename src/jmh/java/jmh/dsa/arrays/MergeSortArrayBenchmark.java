package jmh.dsa.arrays;

import dsa.arrays.MergeSortArray;
import jmh.dsa.AbstractBenchmarkBase;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.infra.Blackhole;

import java.util.Arrays;

public class MergeSortArrayBenchmark extends AbstractBenchmarkBase {

    public static class InputState extends InputStateBase {
        private int[] nums1Template;
        private int[] nums2;
        private int m, nVal;

        public final MergeSortArray solver = new MergeSortArray();


        @Setup
        public void setup() {
            // Split n into m and nVal (roughly equal parts)
            m = n / 2;
            nVal = n - m;

            // Create nums1 template (first m elements are sorted, rest are zeros)
            nums1Template = new int[n]; // Total size is n (m + nVal)
            for (int i = 0; i < m; i++) {
                nums1Template[i] = rnd.nextInt(1000);
            }
            Arrays.sort(nums1Template, 0, m); // Sort only first m elements
            // Last nVal elements remain 0

            // Create sorted nums2 with nVal elements
            nums2 = new int[nVal];
            for (int i = 0; i < nVal; i++) {
                nums2[i] = rnd.nextInt(1000);
            }
            Arrays.sort(nums2);
        }

        public int[] getFreshNums1() {
            return nums1Template.clone();
        }

        public int[] getNums2() {
            return nums2;
        }

        public int getM() {
            return m;
        }

        public int getN() {
            return nVal;
        }
    }

    @Benchmark
    public void bruteForceMerge(InputState state, Blackhole bh) {
        int[] nums1 = state.getFreshNums1();
        state.solver.bruteForceMerge(nums1, state.getM(), state.getNums2(), state.getN());
        bh.consume(nums1);
    }

    @Benchmark
    public void optimizedMerge(InputState state, Blackhole bh) {
        int[] nums1 = state.getFreshNums1();
        state.solver.optimizedMerge(nums1, state.getM(), state.getNums2(), state.getN());
        bh.consume(nums1);
    }
}
