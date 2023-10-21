//package com.company;
////import java.util.*;
////class Node{
////    int data;
////    Node next;
////    Node(int d) {data = d; next = null;}
////}
////class Remove_Duplicate_From_LL
////{
////    Node head;
////    Node tail;
////    public void addToTheLast(Node node)
////    {
////        if (head == null){
////            head = node;
////            tail = node;
////        }
////        else {
////            tail.next= node;
////            tail=node;
////        }
////    }
////    void printList()
////    {
////        Node temp = head;
////        while ((temp != null)) {
////            System.out.println(temp.data + " ");
////            temp = temp.next;
////        }
////        System.out.println();
////    }
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        Remove_Duplicate_From_LL llist = null;
////        while (t > 0) {
////            int n = sc.nextInt();
////            llist = new Remove_Duplicate_From_LL();
////            int a1 = sc.nextInt();
////            Node head = new Node(a1);
////            llist.addToTheLast(new Node(a1));
////        }
////        GfG g = new GfG();
////        llist.head = g.removeDuplicates(llist.head);
////        llist.printList();
////
////        t--;
////
////    }
////}
////
////class SinglyLinkedList
////{
////    //Function to remove duplicates from sorted linked list.
////    Node removeDuplicates(Node head) {
////        if (head == null) {
////            return null;
////        }
////
////        Node current = head;
////        while (current.next != null) {
////            if (current.data == current.next.data) {
////                current.next = current.next.next;
////            } else {
////                current = current.next;
////            }
////        }
////
////        return head;
////    }
////}
////
//
//import java.util.*;
//
//class Node{
//    int data;
//    Node next;
//
//    Node(int d){
//        data = d;
//        next = null;
//    }
//}
//
//public class SinglyLinkedList
//{
//    public static void print(Node root){
//        Node temp =root;
//        while (temp!=null){
//            System.out.println(temp.data + " ");
//            temp = temp.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        int value;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a1 = sc.nextInt();
//        Node head = null;                       /////
//        Node tail = head;
//
//        for (int i =1; i< n &&sc.hasNextInt(); i++){
//            int a = sc.nextInt();
//            tail.next = new Node(a);
//            tail = tail.next;
//        }
//
//        Node result = new Solution().compute(head);
//        print(result);
//        System.out.println();
//        int t = 0;
//        t--;
//    }
//}