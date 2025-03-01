class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Dummy node pointing to head
        ListNode fake = new ListNode(0, head);
        ListNode curr = fake;

        while (curr.next != null && curr.next.next != null) {
            if (curr.next.val == curr.next.next.val) {
                // Store the duplicate value
                int duplicate = curr.next.val;

                // Remove all occurrences of the duplicate
                while (curr.next != null && curr.next.val == duplicate) {
                    curr.next = curr.next.next;
                }
            } else {
                // Move forward only if no duplicate was found
                curr = curr.next;
            }
        }

        return fake.next;
    }
}
