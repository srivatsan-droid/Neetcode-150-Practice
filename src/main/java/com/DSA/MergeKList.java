package com.DSA;

public class MergeKList {

    // Definition for singly-linked list node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;

            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }

        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0) return null;
            return divideAndConquer(lists, 0, lists.length - 1);
        }

        private ListNode divideAndConquer(ListNode[] lists, int left, int right) {
            if (left == right) return lists[left];

            int mid = left + (right - left) / 2;
            ListNode l1 = divideAndConquer(lists, left, mid);
            ListNode l2 = divideAndConquer(lists, mid + 1, right);
            return mergeTwoLists(l1, l2);
        }
    }

    // Helper method to build a linked list from an array
    private static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    private static void printList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(" -> ");
            head = head.next;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = buildList(new int[]{1, 4, 5});
        lists[1] = buildList(new int[]{1, 3, 4});
        lists[2] = buildList(new int[]{2, 6});

        Solution solution = new Solution();
        ListNode merged = solution.mergeKLists(lists);

        printList(merged);
    }
}