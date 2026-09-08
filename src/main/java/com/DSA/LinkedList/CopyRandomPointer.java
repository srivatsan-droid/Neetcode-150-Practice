package com.DSA.LinkedList;

import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode random;

    ListNode(int val) {
        this.val = val;
    }
}
public class CopyRandomPointer {
    public static ListNode copyRandom(ListNode head) {
        HashMap<ListNode,ListNode> map = new HashMap<>();
        ListNode curr = head;
        while(curr != null) {
            map.put(curr, new ListNode(curr.val));
            curr = curr.next;
        }
        curr = head;
        while(curr != null) {
            ListNode copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            if(temp.next != null) {
                System.out.println("-->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(7);
        ListNode node2 = new ListNode(13);
        ListNode node3 = new ListNode(11);
        ListNode node4 = new ListNode(10);
        ListNode node5 = new ListNode(1);

        // next pointers
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // random pointers
        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        ListNode head = node1;
        head = copyRandom(head);
        printList(head);
    }
}
