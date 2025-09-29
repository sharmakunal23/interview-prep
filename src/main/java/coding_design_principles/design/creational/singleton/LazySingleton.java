package coding_design_principles.design.creational.singleton;

/**
 * Simplest Implementation.
 * This implementation is not thread-safe.
 * If multiple threads call getInstance() simultaneously when instance is null, it's possible to create multiple instances.
 */
public class LazySingleton {
    // The single instance, initially null
    private static LazySingleton instance;
    private String value;

    // Private constructor to prevent instantiation
    private LazySingleton() {
        value = "Lazy Singleton Value";
    }

    // Public method to get the instance
    public static LazySingleton getInstance() {
        if (instance == null) {
            try {
                instance = new LazySingleton();
            } catch (Exception e) {
                throw new RuntimeException("Exception occurred in creating singleton instance");
            }
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
