package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareIPV4Test {
    private CompareIPV4 compareIPV4;

    @BeforeEach
    void setUp() {
        compareIPV4 = new CompareIPV4();
    }

    @AfterEach
    void tearDown() {
        compareIPV4 = null;
    }

    @Test
    void solution() {
        String ip1 = "192.168.1.1";
        String ip2 = "192.168.1.2";

        assertEquals(ip2, compareIPV4.solution(ip1, ip2));

        ip1 = "192.168";
        ip2 = "192.168.1.2";

        assertEquals(ip2, compareIPV4.solution(ip1, ip2));

        ip1 = "193.168.1.1";
        ip2 = "192.168.1.2";

        assertEquals(ip1, compareIPV4.solution(ip1, ip2));

        ip1 = "192.168.1.1";
        ip2 = "192.168.1.1";

        assertEquals(ip1, compareIPV4.solution(ip1, ip2));

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> compareIPV4.solution("", "192.168.1.2"));
        assertEquals("IPv4 is invalid with ip: ", thrown.getMessage());
    }
}