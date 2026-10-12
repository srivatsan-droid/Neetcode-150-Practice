package com.DSA.LinkedList;

public class SearchNodeFromLinkedList {
    public static boolean searchKey(Node1 head, int key) {
        Node1 curr = head;
        while(curr != null) {
            if(curr.data == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node(3);
        int x = 2;
        boolean ans = searchKey(head,x);
        System.out.println(ans);
    }
}
