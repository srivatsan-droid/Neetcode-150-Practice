package com.DSA.LinkedList;

public class ReverseLinkedListII {
    public static Node reverseBetween(Node head, int left, int right) {

        // Dummy node helps when left = 1
        Node dummy = new Node(0);
        dummy.next = head;

        // Move prev to the node just before 'left'
        Node prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // curr is the first node that we need to reverse
        Node curr = prev.next;

        // Move nodes after curr to the front
        for (int i = 0; i < right - left; i++) {

            Node next = curr.next;

            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
    public static void printList(Node head) {
        while(head != null) {
            System.out.println(head.data);
            if(head.next != null) {
                System.out.println("-->");
            }
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int left = 2;
        int right = 4;
        head = reverseBetween(head,left,right);
        printList(head);
    }
}
