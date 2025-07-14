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
