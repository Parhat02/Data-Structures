package main.stacks.review;

public class FastStackTest {
    public static void main(String[] args) {
        FastStack<Integer> newStack=new FastStack<>();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        System.out.println(newStack.pop());
        System.out.println(newStack.size());
        newStack.printNodes();
    }
}
