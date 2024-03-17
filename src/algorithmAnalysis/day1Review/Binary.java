package algorithmAnalysis.day1Review;

import java.util.ArrayList;
import java.util.Arrays;

public class Binary {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,1,2,11,12,13,14};
        System.out.println(binarySearch(arr, 14));


        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(binarySearchInteractive(array, 5));

    }

    public static int binarySearch(int[] arr, int target){

        int[] arr1 = Arrays.stream(arr).sorted().toArray();
        if (target>arr1[arr1.length-1]){
            System.err.println("The target doesn't exist in this array");
            return 0;
        }
        int left = 0;
        int right = arr1.length;
        System.out.println(Arrays.toString(arr1));
        int middle =0;
        int operation = 0;
        for (int i = 0; i < arr1.length; i++) {
            operation ++;
            middle = (left+right)/2;
            if (middle==target){
                break;
            }
            if (middle<target){
                left = middle;
            }else {
                right = middle;
            }
        }
        System.out.println("operation = " + operation);
        return middle;
    }


    public static int binarySearchInteractive(int[] array, int data){
        int left = 0;
        int right = array.length-1;
        int operations = 0;
        while (left<right){
            int middle = (left+right)/2;
            if (array[middle] == data){
                System.out.println("Number of operations = " + operations);
                return middle;
            }
            if (data<array[middle]){
                right = middle;
            }else {
                left = middle;
            }
            operations++;
        }
        System.out.println("Number of operations = " + operations);
        return -1;
    }
}
