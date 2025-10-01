package dsa.linked_list;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MergeTwoSortedListsTest {
    private MergeTwoSortedLists mergeTwoSortedLists;
    private ListNode listNode1, listNode2;

    @BeforeEach
    void setUp() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
        listNode1 = new ListNode(0);
        listNode2 = new ListNode(0);

    }

    @AfterEach
    void tearDown() {
        mergeTwoSortedLists = null;
    }

    @Test
    void mergeTwoLists() {
        listNode1.next = new ListNode(1);
        listNode2.next = new ListNode(1);
        listNode1.next.next = new ListNode(2);
        listNode2.next.next = new ListNode(3);

        ListNode result = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);

        assertNotNull(result);
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
        assertEquals(2, result.next.next.next.next.val);
        assertEquals(3, result.next.next.next.next.next.val);
    }
}