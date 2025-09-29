package jmh.coding_design_principles.design.creational.singleton;

import coding_design_principles.design.creational.singleton.DoubleCheckedSingleton;
import coding_design_principles.design.creational.singleton.EagerSingleton;
import coding_design_principles.design.creational.singleton.EnumSingleton;
import coding_design_principles.design.creational.singleton.LazySingleton;
import coding_design_principles.design.creational.singleton.ThreadSafeSingleton;
import jmh.dsa.AbstractBenchmarkBase;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.infra.Blackhole;

public class SingletonBenchmark extends AbstractBenchmarkBase {

    public static class InputState extends InputStateBase {
        @Override
        @Setup
        public void setup() {
        }
    }

    @Threads(4)
    @Benchmark
    public void testEnumInstanceAccess(InputState state, Blackhole bh) {
        for (int i = 0; i < state.n; i++) {
            String value = EnumSingleton.INSTANCE.getValue();
            bh.consume(value);
        }
    }

    @Threads(4)
    @Benchmark
    public void testLazySingletonAccess(InputState state, Blackhole bh) {
        for (int i = 0; i < state.n; i++) {
            String value = LazySingleton.getInstance().getValue();
            bh.consume(value);
        }
    }

    @Threads(4)
    @Benchmark
    public void testThreadSafeAccess(InputState state, Blackhole bh) {
        for (int i = 0; i < state.n; i++) {
            String value = ThreadSafeSingleton.getInstance().getValue();
            bh.consume(value);
        }
    }

    @Threads(4)
    @Benchmark
    public void testDoubleCheckAccess(InputState state, Blackhole bh) {
        for (int i = 0; i < state.n; i++) {
            String value = DoubleCheckedSingleton.getInstance().getValue();
            bh.consume(value);
        }
    }

    @Threads(4)
    @Benchmark
    public void testEagerSingletonAccess(InputState state, Blackhole bh) {
        for (int i = 0; i < state.n; i++) {
            String value = EagerSingleton.getInstance().getValue();
            bh.consume(value);
        }
    }
}
