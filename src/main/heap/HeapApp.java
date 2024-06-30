package main.heap;

public class HeapApp {

    public static void main(String[] args) {
        MyHeap heap=new MyHeap(10);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);
        heap.printHeap();
        heap.remove();
        heap.printHeap();
        heap.insert(130);
        heap.printHeap();
        heap.remove();
        heap.printHeap();

        System.out.println("==========Heapify==============");
        int[] numbers = {1,2,13,5,35,6,8,21,0};
        MyHeap heap1=new MyHeap(numbers);
        heap1.printHeap();
    }
}
