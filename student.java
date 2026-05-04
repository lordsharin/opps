// Write a program to display the student name, roll no and age of a student using class and
//object concept
import java.util.Scanner;

public class student {

    // Step 1 - Create variables inside class
    String name;
    int rollNo;
    int age;

    // Step 2 - Create a method to display details
    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Age          : " + age);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 3 - Create an object of Student class
        student s = new student();

        // Step 4 - Take input from user
        System.out.print("Enter Student Name : ");
        s.name = sc.next();

        System.out.print("Enter Roll Number  : ");
        s.rollNo = sc.nextInt();

        System.out.print("Enter Age          : ");
        s.age = sc.nextInt();
        sc.close(); // ✅ Scanner closed

        System.out.println("\n--- Student Details ---");

        // Step 5 - Call display method
        s.display();
    }
}