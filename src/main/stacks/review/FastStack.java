package main.stacks.review;

public class FastStack<T> {
    MySinglyLinkedStack<T> list;

    public FastStack() {
        this.list = new MySinglyLinkedStack<>();
    }
    int size(){
        return list.size;
    }
    void push(T t){
        list.addFirst(t);
    }
    T pop(){
        return list.removeFirst();
    }

    void printNodes(){
        list.printNodes();
    }
}
