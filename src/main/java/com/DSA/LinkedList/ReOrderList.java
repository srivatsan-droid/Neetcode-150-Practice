package com.DSA.LinkedList;

public class ReOrderList {
    public static void reOrder(Node head) {
        //Find Middle of the list
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //Split the List with First Half and Second Half
        Node second = slow.next;
        slow.next = null;

        Node prev = null;
        Node curr = second;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node first = head;
        Node secondHead = prev;

        while (secondHead != null) {

            Node firstNext = first.next;
            Node secondNext = secondHead.next;

            first.next = secondHead;
            secondHead.next = firstNext;

            first = firstNext;
            secondHead = secondNext;
        }
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
        reOrder(head);
        printList(head);
    }
}
