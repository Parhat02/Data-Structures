package main.algorithmAnalysis.day1Review;

import java.util.Arrays;

public class MyArrayList {

    // Define array
    int[] numbers;
    int size;

    public MyArrayList() {
        this.numbers=new int[10];
        this.size=0;
    }

    public MyArrayList(int capacity){
        this.numbers = new int[capacity];
        this.size=0;
    }
    int[] grow(){

        return Arrays.copyOf(numbers, numbers.length *2);
//        int[] newArray=new int[numbers.length * 2];
//        for (int i = 0; i < numbers.length; i++) {
//            newArray[i]=numbers[i];
//        }
//        numbers=newArray;
//        return numbers;
    }
    void add(int value){
        // check capacity
        if(size>= (int)numbers.length *0.75)
        { // grow the arraylist
            //System.out.println("Before adding " + value + "Size of arraylist was " + this.size + "and length was " + numbers.length );
            numbers=grow();// this method will return address of new array;
            // System.out.println("After adding " + value +  "and the new length is " + numbers.length );
        }
        numbers[size++]=value;
    }
    int size() {
        return this.size;
    }
}
