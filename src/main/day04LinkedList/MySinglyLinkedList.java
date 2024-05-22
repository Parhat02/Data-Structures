package main.day04LinkedList;

public class MySinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    boolean isEmpty(){
        return head==null;
    }

    public void add(int data){
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

    public void addFirst(int value){
        // create a new Note from the value
        Node newNode = new Node(value);
        if (isEmpty()){
            head=tail=newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void  deleteById(int id){
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

    public int indexOf(int id){
        if (isEmpty()){
            return -1;
        }
        int pos = 0;
        //iterate through the list
        Node current = head; // set my current with the starting element
        while (current != null){
            if (current.id == id){
                return pos;
            }
            pos++;
            current = current.next;
        }
        return -1;
    }

    public void printNode(){
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

    public int getKthItemFromLast(int k){
        //create two pointers
        Node ptr1 = head;
        Node ptr2 = head;

        //move ptr2 k-1 times
        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
        }
        //move both pointers until ptr2 hits the last element
        while (ptr2.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        //ptr1 is on the Kth element from the last
        return ptr1.id;
    }

    public void removeKthItemFromLast(int k){
        //create two pointers
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;

        //move ptr2 k-1 times
        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
        }
        //move both pointers until ptr2 hits the last element
        while (ptr2.next!=null){
            prev=ptr1;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        
        if (ptr1==head){
            head=ptr1.next;
            ptr1 = null;
            size--;
        } else if (ptr1==tail) {
            tail=prev;
            prev.next=null;
            size--;
        }else {
            prev.next=ptr1.next;
            ptr1=null;
            size--;
        }

    }

}
