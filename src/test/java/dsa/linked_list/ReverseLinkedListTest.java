package dsa.linked_list;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {
    private ListNode head;
    private ReverseLinkedList reverseLinkedList;

    @BeforeEach
    void setUp() {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        reverseLinkedList = new ReverseLinkedList();
    }

    @AfterEach
    void tearDown() {
        head = null;
        reverseLinkedList = null;
    }

    @Test
    void reverseListIterative() {
        Assertions.assertEquals(head.next.next.next, reverseLinkedList.reverseListIterative(head));
    }

    @Test
    void reverseListRecursive() {
        Assertions.assertEquals(head.next.next.next, reverseLinkedList.reverseListRecursive(head));
    }
}