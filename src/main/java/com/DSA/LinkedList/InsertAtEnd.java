package com.DSA.LinkedList;

public class InsertAtEnd {
    public static Node insertAtEnd(Node head,int x) {
        Node newNode = new Node(x);
        if(head == null) {
            return newNode;
        }
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return head;
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
        int x = 10;
        head = insertAtEnd(head,x);
        printList(head);
    }
}
