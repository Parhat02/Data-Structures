package main.day04LinkedList.linkedListReview;

public class UserLinkCreationTest {

    public static void main(String[] args) {

        UserLinkedList list=new UserLinkedList();
        list.printNames();
        list.insertLast(new User("Jason", "AAA"));
        list.insertLast(new User("Jack","Reacher"));
        list.insertLast(new User("Carol","Reacher3"));
        list.printNames();
        System.out.println();
        list.get(2);
        System.out.println(list.get2(2));
    }
}
