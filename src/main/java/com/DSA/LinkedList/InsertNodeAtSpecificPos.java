package com.DSA.LinkedList;

public class InsertNodeAtSpecificPos {
    public static Node insertPos(Node head,int pos,int x) {
        if(pos < 1) {
            return head;
        }
        if(pos == 1) {
            Node newNode = new Node(x);
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        for(int i = 1;i < pos - 1 && curr != null;i++) {
            curr = curr.next;
        }
        if(curr == null) {
            return head;
        }
        Node newNode = new Node(x);
        newNode.next = curr.next;
        curr.next = newNode;
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
        int pos = 3;
        int x = 6;
        head = insertPos(head,pos,x);
        printList(head);
    }
}
