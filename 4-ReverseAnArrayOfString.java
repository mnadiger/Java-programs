// using a two-pointer technique to swap elements

import java.util.Arrays;

public class ReverseStringArray {

    public static void main(String[] args) {
      
        String[] originalArray = {"apple", "banana", "cherry", "date"};
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));



        reverseArray(originalArray);
        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
    }


    public static void reverseArray(String[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex < rightIndex) {
            // Swap elements at left and right pointers
            String temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;

            // Move pointers inward
            leftIndex++;
            rightIndex--;
        }
    }
}
