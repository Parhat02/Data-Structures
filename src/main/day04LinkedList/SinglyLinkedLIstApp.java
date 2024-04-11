package main.day04LinkedList;

public class SinglyLinkedLIstApp {
    public static void main(String[] args) {
        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.printNode();

        myList.deleteById(7);
        myList.printNode();

        myList.deleteById(1);
        myList.printNode();

        myList.deleteById(9);
        myList.printNode();

        System.out.println("Index of 3: " + myList.indexOf(3));

    }

}
