package dsa.linked_list;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int x) {
        this.val = x;
        this.next = null;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
