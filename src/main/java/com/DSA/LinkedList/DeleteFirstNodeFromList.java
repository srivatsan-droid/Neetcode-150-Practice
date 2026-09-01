package com.DSA.LinkedList;

public class DeleteFirstNodeFromList {
    public static Node deleteFirst(Node head) {
        if(head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
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
        head = deleteFirst(head);
        printList(head);
    }
}
