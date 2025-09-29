package coding_design_principles.design.creational.singleton;

/**
 * The enum approach is the most efficient way to create a Singleton in Java because: <p>
 *
 * - Thread-safe by default <p>
 * - Serialization-safe (prevents multiple instances) <p>
 * - Protection against reflection attacks <p>
 * - Concise and simple code <p>
 */
public enum EnumSingleton {
    INSTANCE;

    private String value;
    EnumSingleton() {
        value = "Enum Singleton Value";
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
