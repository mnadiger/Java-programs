// 1. Using a Two-Pointer Approach (for primitive arrays like int[]):
// This method involves using two pointers, one starting from the beginning of the array and the other from the end. Elements at these positions are swapped until the pointers meet or cross. 

    import java.util.Arrays;
    
    public class ArrayReverseExample {
        public static void main(String[] args) {
            int[] myArray = {1, 2, 3, 4, 5};

            int startIndex = 0;
            int endIndex = myArray.length - 1;  //

            while (startIndex < endIndex) {
                int temp = myArray[startIndex];
                myArray[startIndex] = myArray[endIndex];
                myArray[endIndex] = temp;

                startIndex++;
                endIndex--;
            }
            
            // To print in array format => [5, 4, 3, 2, 1]
            System.out.println("Reversed Array: " + Arrays.toString(myArray));  
            
            //To print just numbers => 5 4 3 2 1
            for(int num: myArray) {
              System.out.print(num + " ");
            }

          
        }
    }



// ***************************************************


// 2. Using Collections.reverse() (for object arrays like Integer[]):
// This method leverages the Collections utility class, which provides a convenient reverse() method for List objects. The array must first be converted to a List.


import java.util.Arrays;
import java.util.Collections;

public class ReverseObjectArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(arr));

        // Convert array to List and then reverse
        Collections.reverse(Arrays.asList(arr));

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
