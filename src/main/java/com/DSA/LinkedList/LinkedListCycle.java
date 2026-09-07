package com.DSA.LinkedList;

public class LinkedListCycle {
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            if(temp.next != null) {
                System.out.println("-->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        boolean ans = hasCycle(head);
        System.out.println(ans);
    }
}
