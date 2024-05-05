package main.day04LinkedList.linkedListReview;

public class UserLinkedList {
    User head;
    User tail;
    int size; // this will hold the number of elements in list

    public UserLinkedList() {
        this.head=null;
        this.tail=null;
        size=0;
    }

    boolean isEmpty(){
        return head==null;
    }

    void insertLast(User node){
        // 2 cases: 1. list is empty
        if (isEmpty()){
            head=tail=node;
        }else { //2. case: list is not empty
            tail.next=node;
            tail=node;
        }
        size++;
    }

    void printNames(){
        if(isEmpty()) {System.out.println("List is empty");
            return;}

        User current = head;
        while (current!=null){
            System.out.print(current.name + " =>");
            current=current.next;
        }
    }

    void get(int index){
        if (index >=size){
            System.out.println("Index out of bound");
            return;
        }else {
            User current = head;
            for (int i = 0; i < index; i++) {
                current=current.next;
            }
            System.out.println(current.name);
        }
    }

    User get2(int index){
        if (index >=size){
            System.out.println("Index out of bound");
            return null;
        }else {
            User current = head;
            for (int i = 0; i < index; i++) {
                current=current.next;
            }
            return current;
        }
    }

}
