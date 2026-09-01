package com.DSA.LinkedList;

public class ReverseLinkedList {
    public static Node reverseList(Node head) {
        Node curr = head,prev = null,next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
        head = reverseList(head);
        printList(head);
    }
}
