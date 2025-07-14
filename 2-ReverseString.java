// Java program to Reverse String Using StringBuilder
import java.io.*;

class Main {
    public static void main(String[] args) {
      
        String s = "Geeks";
      
      	// Object Initialised
        StringBuilder res = new StringBuilder();

        // Appending elements of s in res
        res.append(s);

        // reverse StringBuilder res
        res.reverse();

        // print reversed String
        System.out.println("Reversed String: " + res);
    }
}


// **********************************************************************

// Java Program to Reverse a String Using for loop
import java.io.*;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
      
        String str = "Geeks"; 
        String reversed = "";
        char ch;

 
        for (int i = str.length() -1; i >= 0; i--) {
          	
          	// extracts each character from the end
            ch = str.charAt(i);
          
          	// adds each character to the existing string
            reversed =  reversed + ch; 
        }
      System.out.println("Reversed String is: " +  reversed);


      // or


        for (int i = 0; i < str.length(); i++) {
          	
          	// extracts each character
            ch = str.charAt(i);
          
          	// adds each character in front of the existing string
            reversed = ch + reversed; 
        }
      
        System.out.println(reversed);
    }
}

// ********************************************

// Java program to Reverse a String by Converting string to characters one by one
import java.io.*;

class Main {
  
    public static void main(String[] args) {
      
        String s = "Geeks";

        // Using toCharArray to copy elements
        char[] arr = s.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}
