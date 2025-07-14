import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int number = 12345; // The number to be reversed
        int reversedNumber = 0;     // Stores the reversed number
        
        // Loop until the original number becomes 0
        while (number != 0) {
            int remainder = number % 10;                                 // Extract the last digit
            reversedNumber = reversedNumber * 10 + remainder;            // Build the reversed number
            number = number / 10;                                        // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
  }


//*************************************************


import java.io.*;

// Driver Class
class ReverseNumber
{
    // Function to reverse the number
    static int reverse(int n)
    {
        // reversed number
        int rev = 0;
        // remainder
        int rem;

        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        return rev;
    }

    // Driver Function
    public static void main(String[] args)
    {
        int n = 4526;
        System.out.print("Reversed Number is: " + reverse(n));
    }
}


// The complexity of the above method:
// Time complexity: O(log10n) for given number n
// Auxiliary space: O(1)



//**************************************************************

// Java Program to reverse a Number
// using a StringBuilder Class
import java.util.*;

// Driver Class
public class Reverse
{
    // main function
    public static void main(String[] args)
    {
        int n = 123456;
        
        // conversion of int to string
        String temp = "" + n;

        // creating stringbuilder obj
        StringBuilder sb = new StringBuilder(temp);
        
        // using reverse method to
        // reverse the obj
        StringBuilder str = sb.reverse();
        
        // printing reverse number
        System.out.println(str.toString());
    }
}


// The complexity of the above method:

// Time Complexity : O(ln) 
// Auxiliary Space: O(n)
