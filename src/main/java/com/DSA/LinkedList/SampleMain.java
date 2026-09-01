package com.DSA.LinkedList;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SampleMain {
    public static void main(String[] args) {
        Node head =  new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
