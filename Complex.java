//Write a Java program to perform arithmetic operations of two complex numbers using class.
import java.util.Scanner;

public class Complex {

    int real;
    int imag;

    // Method to take input
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Real part      : ");
        real = sc.nextInt();
        System.out.print("Enter Imaginary part : ");
        imag = sc.nextInt();
        sc.close(); // ✅ Scanner closed
    }

    // Addition
    void add(Complex c1, Complex c2) {
        int r = c1.real + c2.real;
        int i = c1.imag + c2.imag;
        System.out.println("Addition       : " + r + " + " + i + "i");
    }

    // Subtraction
    void subtract(Complex c1, Complex c2) {
        int r = c1.real - c2.real;
        int i = c1.imag - c2.imag;
        System.out.println("Subtraction    : " + r + " + " + i + "i");
    }

    // Multiplication
    void multiply(Complex c1, Complex c2) {
        int r = (c1.real * c2.real) - (c1.imag * c2.imag);
        int i = (c1.real * c2.imag) + (c1.imag * c2.real);
        System.out.println("Multiplication : " + r + " + " + i + "i");
    }

    public static void main(String[] args) {

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        System.out.println("--- Enter First Complex Number ---");
        c1.real = 4;
        c1.imag = 5;

        System.out.println("--- Enter Second Complex Number ---");
        c2.real = 2;
        c2.imag = 3;

        System.out.println("\nFirst Number  : " + c1.real + " + " + c1.imag + "i");
        System.out.println("Second Number : " + c2.real + " + " + c2.imag + "i");

        System.out.println("\n--- Results ---");
        c3.add(c1, c2);
        c3.subtract(c1, c2);
        c3.multiply(c1, c2);
    }
}