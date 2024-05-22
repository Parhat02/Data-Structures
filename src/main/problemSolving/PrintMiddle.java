package main.problemSolving;

import main.day04LinkedList.MySinglyLinkedList;
import main.day04LinkedList.Node;

public class PrintMiddle {

    public static void main(String[] args) {
        MySinglyLinkedList sll = new MySinglyLinkedList();
        for (int i = 0; i < 6; i++) {
            sll.add(i);
        }
        printMiddle(sll);
    }

    public static void printMiddle(MySinglyLinkedList sll){

        //create two pointer
        Node a = sll.head;
        Node b = sll.head;

        //iterate over the linked list
        while (b!=sll.tail && b.next != sll.tail){
            a = a.next; // single jump
            b = b.next.next; // double jump
        }
        if (b==sll.tail) System.out.println(a.id);
        else System.out.println(a.id+ ", " + a.next.id);
    }
}
