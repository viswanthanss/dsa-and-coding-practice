// This is already defined by LeetCode:
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int val) { this.val = val; }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // If one of the lists is empty, return the other
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Step 1: Choose the smaller first node to be the head of the merged list
        ListNode head;  // This will be the first node in the result
        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;  // move forward in list1
        } else {
            head = list2;
            list2 = list2.next;  // move forward in list2
        }

        // Step 2: tail is used to build the rest of the list
        ListNode tail = head;

        // Step 3: Walk through both lists and keep attaching the smaller value
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;  // move the tail forward
        }

        // Step 4: Attach whichever list is not empty (since it's already sorted)
        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return head;  // head points to the merged list
    }
}
