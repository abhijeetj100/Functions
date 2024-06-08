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
        System.out.println("Number of factors for 50 is: " + CountFactors(50));

        System.out.println("Number 5 is Prime?: " + CheckPrime(5));
        System.out.println("Number 8 is Prime?: " + CheckPrime(8));

        System.out.println("Perfect square root of 25: " + GetPerfectSquareRoot(25));
        System.out.println("Is 25 a perfect square?: " + IsPerfectSquare(25));
        System.out.println("Perfect square root of 48: " + GetPerfectSquareRoot(48));
        System.out.println("Is 48 a perfect square?: " + IsPerfectSquare(48));

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{4, 5, 6};
        MergeTwoSortedArrays(nums1, 3, nums2, 3);
        System.out.println();

        int[] nums3 = new int[]{1, 1, 2};
        System.out.println(RemoveDuplicatesFromSortedArray(nums3));
        System.out.println();

        int[] nums4 = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(RemoveDuplicatesFromSortedArray_Two(nums4));
        System.out.println();

        int[] nums5 = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println("Majority element in array nums5: " + MajorityElement(nums5));
        System.out.println();
    }
}