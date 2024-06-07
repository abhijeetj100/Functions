import java.util.*;

import static Functions.Functions.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int a1 = 10;
        int a2 = 4;
        System.out.println("Number a1 exists in arr?  " + NumberExistsIn1DArray(array, a1));
        System.out.println("Number a2 exists in arr?  " + NumberExistsIn1DArray(array, a2));

        System.out.println("Number of factors for 10 is: " + CountFactors(10));
        // Checking if branch protection is working..
    }
}