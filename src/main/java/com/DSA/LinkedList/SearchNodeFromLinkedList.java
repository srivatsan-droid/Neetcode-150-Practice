package com.DSA.LinkedList;

public class SearchNodeFromLinkedList {
    public static boolean searchKey(Node head,int key) {
        Node curr = head;
        while(curr != null) {
            if(curr.data == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        int x = 2;
        boolean ans = searchKey(head,x);
        System.out.println(ans);
    }
}
