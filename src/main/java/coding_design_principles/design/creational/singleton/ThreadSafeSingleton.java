package coding_design_principles.design.creational.singleton;

/**
 * Although this approach is straightforward, using synchronized can cause substantial
 * overhead and reduce performance, which can be a bottleneck if called frequently.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private String value;

    private ThreadSafeSingleton() {
        value = "Thread SafeSingleton Value";
    }


    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            try {
                instance = new ThreadSafeSingleton();
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
