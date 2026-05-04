//1. Write a program to check whether a number is palindrome or not.

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int original = num;  // save the original number
        int reversed = 0;

        // Reverse the number
        while (num > 0) {
            int lastDigit = num % 10;        // get last digit
            reversed = reversed * 10 + lastDigit;  // add to reversed
            num = num / 10;                  // remove last digit
        }

        // Check if original and reversed are same
        if (original == reversed) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}