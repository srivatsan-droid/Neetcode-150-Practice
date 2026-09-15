package com.DSA;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public static ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        ListNode1 dummy = new ListNode1(0);
        ListNode1 tail = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode1 newNode = new ListNode1(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return dummy.next;
    }

    // Helper: build a linked list from an int array
    public static ListNode1 buildList(int[] values) {
        ListNode1 dummy = new ListNode1(0);
        ListNode1 tail = dummy;
        for (int v : values) {
            tail.next = new ListNode1(v);
            tail = tail.next;
        }
        return dummy.next;
    }

    // Helper: print a linked list as [a, b, c]
    public static void printList(ListNode1 head) {
        StringBuilder sb = new StringBuilder("[");
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(", ");
            head = head.next;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        ListNode1 l1 = buildList(new int[]{2, 4, 3});
        ListNode1 l2 = buildList(new int[]{5, 6, 4});

        ListNode1 result = addTwoNumbers(l1, l2);
        printList(result); // Expected: [7, 0, 8]

        ListNode1 l3 = buildList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode1 l4 = buildList(new int[]{9, 9, 9, 9});

        ListNode1 result2 = addTwoNumbers(l3, l4);
        printList(result2); // Expected: [8, 9, 9, 9, 0, 0, 0, 1]
    }
}