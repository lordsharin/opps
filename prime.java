//Write a program to print all the prime numbers between 100 to 200.
public class prime {
    public static void main(String[] args) {

        System.out.println("Prime numbers between 100 to 200:");

        for (int i = 100; i <= 200; i++) {

            boolean isPrime = true; // assume number is prime

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {       // if divisible by any number
                    isPrime = false;    // it's NOT prime
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}