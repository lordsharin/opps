// Write a Java program to store marks scored in subject “Object Oriented Programming”
// by N students in the class for the following operations:
// a.The average score of class
// b.Highest score and lowest score of class
// c.Count of students who were absent for the test
// d.Display mark with highest frequency
import java.util.Scanner;

public class MarksAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter marks (Enter -1 if the student was absent):");

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        sc.close();

        // a. Calculate Average (Only for students who were present)
        double total = 0;
        int presentCount = 0;
        int absentCount = 0;

        for (int mark : marks) {
            if (mark != -1) {
                total += mark;
                presentCount++;
            } else {
                absentCount++;
            }
        }
        
        double average = (presentCount > 0) ? total / presentCount : 0;

        // b. Highest and Lowest Score
        int highest = -1; 
        int lowest = 101; // Assuming max marks is 100

        for (int mark : marks) {
            if (mark != -1) {
                if (mark > highest) highest = mark;
                if (mark < lowest) lowest = mark;
            }
        }

        // d. Highest Frequency (Mode)
        int highestFreqMark = -1;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (marks[i] == -1) continue;
            
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (marks[i] == marks[j]) count++;
            }

            if (count > maxCount) {
                maxCount = count;
                highestFreqMark = marks[i];
            }
        }

        // Display Results
        System.out.println("\n--- Performance Report ---");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + (highest == -1 ? "N/A" : highest));
        System.out.println("Lowest Score: " + (lowest == 101 ? "N/A" : lowest));
        System.out.println("Absent Students: " + absentCount);
        System.out.println("Mark with Highest Frequency: " + highestFreqMark + " (appeared " + maxCount + " times)");
    }
}