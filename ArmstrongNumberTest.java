//Write a Java code to test whether the given number is Armstrong number or not.
import java.util.Scanner;

public class ArmstrongNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        sc.close();
    }

    static boolean isArmstrong(int n) {
        int temp = n;
        int digits = 0;
        int sum = 0;

        // 1. Calculate the number of digits
        temp = n;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // 2. Calculate the sum of power of digits
        temp = n;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

        // 3. Compare sum with the original number
        return n == sum;
    }
}