package coding_design_principles.design.creational.singleton;

/**
 * This approach minimizes performance overhead from synchronization by only synchronizing when the object is first created. <p>
 * It uses the volatile keyword to ensure that changes to the instance variable are immediately visible to other threads.
 */
public class DoubleCheckedSingleton {
    // The single instance, initially null, marked as volatile
    private static volatile DoubleCheckedSingleton instance;
    private String value;

    private DoubleCheckedSingleton() {
        value = "DoubleChecked Singleton Value";
    }

    public static DoubleCheckedSingleton getInstance() {
        // First check (not synchronized)
        if (instance == null) {
            // Synchronize on the class object
            synchronized (DoubleCheckedSingleton.class) {
                // Second check (synchronized)
                if (instance == null) {
                    try {
                        instance = new DoubleCheckedSingleton();
                    } catch (Exception e) {
                        throw new RuntimeException("Exception occurred in creating singleton instance");
                    }
                }
            }
        }
        // Return the instance (either newly created or existing)
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
