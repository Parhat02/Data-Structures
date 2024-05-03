package main.stacks;

public class StackApp {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        for (int i=0; i<10; i++){
            stack.push(i);
        }

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println("--------------------------");

        stack.push(11);
        stack.push(10);

        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }

        System.out.println("--------------------------");

        System.out.println(stack.peek());
    }
}
