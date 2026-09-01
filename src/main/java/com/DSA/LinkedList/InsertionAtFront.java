package com.DSA.LinkedList;

public class InsertionAtFront {
    public static Node insertFront(Node head,int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
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
        int x = 4;
        head = insertFront(head, x);
        printList(head);
    }
}
