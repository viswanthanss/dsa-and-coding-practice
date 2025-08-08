/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Step 1: Create a normal list to store all numbers
        List<Integer> allNumbers = new ArrayList<>();

        // Step 2: Add all values from list1
        while (list1 != null) {
            allNumbers.add(list1.val);
            list1 = list1.next;
        }

        // Step 3: Add all values from list2
        while (list2 != null) {
            allNumbers.add(list2.val);
            list2 = list2.next;
        }

        // Step 4: Sort the numbers
        Collections.sort(allNumbers);

        // Step 5: Build the new linked list
        ListNode head = null; // first node of the list
        ListNode tail = null; // last node of the list

        // Go through each number in the sorted list
        for (int i = 0; i < allNumbers.size(); i++) {

            // Create a new node containing this number
            ListNode newNode = new ListNode(allNumbers.get(i));

            // If the linked list is empty
            if (head == null) {
                head = newNode;  // first node
                tail = newNode;  // also last node for now
            } 
            // If the list already has something
            else {
                tail.next = newNode; // join at the end
                tail = newNode;      // update last node
            }
        }

        // Step 6: Return the start of the new list
        return head;
    }
}
