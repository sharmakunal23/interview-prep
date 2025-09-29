package coding_design_principles.design.creational.singleton;

/**
 * In this method, we rely on the JVM to create the singleton instance when the class is loaded.
 * The JVM guarantees that the instance will be created before any thread access the instance variable. <p>
 *
 * This implementation is one of the simplest and inherently thread-safe without needing explicit synchronization.
 */
public class EagerSingleton {
    // The single instance, created immediately
    private static final EagerSingleton instance = new EagerSingleton();
    private String value;

    private EagerSingleton() {
        value = "Eager Singleton Value";
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
