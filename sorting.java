//Write Programs in Java to sort i) an array in ascending order ii) to convert char Array to
//String.
import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {

        // -------- Program 1 - Sort Array --------
        int[] arr = {50, 20, 80, 10, 60};

        System.out.println("--- Sorting Array ---");
        System.out.println("Before Sorting : " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("After Sorting  : " + Arrays.toString(arr));


        // -------- Program 2 - Char Array to String --------
        char[] charArr = {'T', 'e', 'j', 'a', 's'};

        System.out.println("\n--- Char Array to String ---");
        System.out.println("Char Array : " + String.valueOf(charArr));

        String str = new String(charArr);

        System.out.println("String     : " + str);
    }
}