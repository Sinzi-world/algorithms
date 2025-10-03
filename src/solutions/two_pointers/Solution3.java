package solutions.two_pointers;

public class Solution3 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aPointer = headA, bPointer = headB;

        if (aPointer == null || bPointer == null) return null;

        while (aPointer != bPointer) {
            aPointer = (aPointer == null) ? headB : aPointer.next;
            bPointer = (bPointer == null) ? headA : bPointer.next;

        }
        return aPointer;
    }
}