package main.problemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetView {

    public static void main(String[] args) {
        int[] buildings = {3,5,4,4,3,1,3,2};
        sunSetView(buildings, "EAST").forEach(System.out::println);
        sunSetView(buildings, "WEST").forEach(System.out::println);
    }

    public static ArrayList<Integer> sunSetView(int[] buildings, String direction){

        Stack<Integer> stack = new Stack<>(); // Stack to hold building indices that can see sunset

        //This part is for East by default
        int i= 0;
        int step = 1;
        // this part is for west
        if (direction.equalsIgnoreCase("west")){
            i = buildings.length-1;
            step =-1;
        }
        while ( i>=0 && i < buildings.length) {

            while (!stack.empty() && buildings[i] >= buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
            i+=step;
        }
        //now We have a stack with the building indices that can see sunset

        if (direction.equalsIgnoreCase("west")) Collections.reverse(stack);
        return new ArrayList<>(stack);
    }
}
