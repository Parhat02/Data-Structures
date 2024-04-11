package main.day04LinkedList;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head==null;
    }

    void add(int data){
        //create a new node object from data
        Node node = new Node(data);

        if (isEmpty()){
            head=tail=node;
        }else { // if there are elements in the list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void  deleteById(int id){
        //check if empty
        if (isEmpty()){
            System.out.println("List is empty!!!");
        }
        // assign previous and current with the head
        Node prev = head;
        Node current = head;
        while (current != null){
            if (current.id == id){ //there is a match
                //case 1: head
                if (current==head){
                    head = current.next;
                    current.next = null; //Ex-Head will be eligible for the Garbage Collection
                }
                //case 2: tail
                else if (current == tail) {
                    tail = prev;
                    prev.next = null; //Ex-Tail will be eligible for the Garbage Collection
                }
                //case 3: middle
                else {
                    prev.next = current.next;
                    current.next = null; //Current will be eligible for the Garbage Collection
                }
                //after deletion
                size--;
            }
            //move forward on the elements of the list
            prev = current;
            current = current.next;
        }
    }

    void printNode(){
        Node current = head;
        while (current != null){
            if (current.next==null){
                System.out.println(current.id + "=> null");
            }else {
                System.out.print(current.id + "=>");
            }
            current = current.next;
        }
    }

}
