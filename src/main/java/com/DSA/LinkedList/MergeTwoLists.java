package com.DSA.LinkedList;

public class MergeTwoLists {
    public static Node mergeList(Node list1,Node list2) {
        Node dummy = new Node(0);
        Node curr = dummy;
        while(list1 != null && list2 != null) {
            if(list1.data <=  list2.data) {
                curr.next = list1;
                list1 = list1.next;
            }
            else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null)
            curr.next = list1;
        if(list2 != null)
            curr.next = list2;
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
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        Node ans = mergeList(list1,list2);
        printList(list1);
    }
}
