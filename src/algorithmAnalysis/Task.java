package algorithmAnalysis;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

        // Assigment 1,  Two Sum
        int[] nums = {2, 7, 11, 15};
        System.out.println(twoSum(nums, 9)); //Time complexity is N**2

        // Assignment 2
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        list.add(new int[] {5,2});
        System.out.println(countPassengers(list)); //Time Complexity is N

    }

    public static String twoSum(int[] intArray, int target){

        int[] newArray = new int[2];
        for (int i = 0; i < intArray.length-1; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i]+intArray[j] == target){
                    newArray[0] = i;
                    newArray[1] = j;
                    break;
                }
            }
        }
        return Arrays.toString(newArray);
    }

    public static int countPassengers(ArrayList<int[]> stops){

        int passengers;
        int peopleGetIn = 0;
        int peopleGetOff = 0;
        for (int[] each:stops){
            peopleGetIn += each[0];
            peopleGetOff += each[1];
        }
        passengers = peopleGetIn - peopleGetOff;
        return passengers;
    }

}
