package coding_design_principles.design.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnumSingletonTest {

    @Test
    void testGetInstance() {
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        Assertions.assertEquals(enumSingleton1, enumSingleton2);

        enumSingleton1.setValue("Update Enum Singleton Value");
        Assertions.assertEquals(enumSingleton1, enumSingleton2);
        Assertions.assertEquals(enumSingleton1.getValue(), enumSingleton2.getValue());
    }
}