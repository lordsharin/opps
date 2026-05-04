// Write a program for the swapping of two numbers using two variables.
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close(); // ✅ Scanner closed

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping logic using two variables only
        a = a + b;  // a now holds sum of both
        b = a - b;  // b gets original a
        a = a - b;  // a gets original b

        System.out.println("After Swap:  a = " + a + ", b = " + b);
    }
}