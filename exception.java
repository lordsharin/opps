//Write a JAVA program to demonstrate exception handling mechanisms
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // This might cause an ArithmeticException if b is 0
            int result = a / b; 
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // This block runs ONLY if a division by zero occurs
            System.out.println("Error: Cannot divide by zero!");
            
        } catch (Exception e) {
            // This block catches any other unexpected errors (like entering text instead of numbers)
            System.out.println("Error: Something went wrong. Invalid input.");

        } finally {
            // This block ALWAYS runs, regardless of an error
            System.out.println("Cleanup: Closing the scanner.");
            sc.close();
        }

        System.out.println("Program continues... Goodbye!");
    }
}