package dsa.linked_list;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
    private LinkedListCycle linkedListCycle;
    private ListNode head;

    @BeforeEach
    void setUp() {
        linkedListCycle = new LinkedListCycle();
        head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = head.next.next;
    }

    @AfterEach
    void tearDown() {
        head = null;
        linkedListCycle = null;
    }

    @Test
    void hasCycle() {
        assertTrue(linkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = null;
        assertFalse(linkedListCycle.hasCycle(head));
    }

    @Test
    void hasCycleHashset() {
        assertTrue(linkedListCycle.hasCycleHashSet(head));

        head.next.next.next.next.next.next = null;
        assertFalse(linkedListCycle.hasCycleHashSet(head));
    }
}