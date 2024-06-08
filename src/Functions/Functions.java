package Functions;

import java.util.ArrayList;

public class Functions {
    public static boolean NumberExistsIn1DArray(ArrayList<Integer> arr, int a){
        for (int j : arr) {
            if (j == a) {
                return true;
            }
        }
        return false;
    }

    public static int CountFactors(int N){
        int count = 0;
        for(int i = 1; i*i<=N; i++){
            if(i*i == N){
                count++;
            }
            if(N%i == 0){
                count+=2;
            }
        }
        return count;
    }

    public static boolean CheckPrime(int N){
        int countOfFactors = CountFactors(N);
        return countOfFactors == 2;
    }

    public static int GetPerfectSquareRoot(int N){
        int ans = 0;
        for(int i = 1; i*i <= N; i++){
            ans = i;
        }
        return ans;
    }

    public static boolean IsPerfectSquare(int N){
        int squareRoot = GetPerfectSquareRoot(N);
        return squareRoot*squareRoot == N;
    }

    public static void MergeTwoSortedArrays(int[] nums1, int m, int[] nums2, int n) {
//      OPTIMIZED SOLUTION

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
//        int[] temp = new int[m+n];
//        int i=0;
//        int j=0;
//        int x = 0;
//        while(i<m && j<n){
//            if(nums1[i]<nums2[j]){
//                temp[x] = nums1[i];
//                i++;
//            }
//            else{
//                temp[x] = nums2[j];
//                j++;
//            }
//            x++;
//        }
//        int[] leftNums = (i == m) ? nums2 : nums1;
//        int leftIndex = (i == m) ? j : i;
//        int endIndex = (i == m) ? n : m;
//        while(leftIndex < endIndex){
//            temp[x] = leftNums[leftIndex];
//            leftIndex++;
//            x++;
//        }
//        for(i = 0; i<m+n; i++){
//            nums1[i] = temp[i];
//        }
    }

    public static int RemoveDuplicatesFromSortedArray(int[] nums){
        int i = 0;
        int index = 1;
        int length = nums.length;
        while(i<length-1){
            if(nums[i] != nums[i+1]){
                nums[index++] = nums[i+1];
            }
            i++;
        }
        return index;
    }

    public static int RemoveDuplicatesFromSortedArray_Two(int[] nums){
//        OPTIMIZED SOLUTION
        int j = 1;
        int length = nums.length;
        for(int i = 1; i<length; i++){
            if(j == 1 || nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;

//        int i = 0;
//        int index_1 = 0;
//        int index_2 = 0;
//        int length = nums.length;
//        while(i<length-1){
//            if(nums[i] != nums[i+1]){
//                index_1 = index_2+1;
//                index_2 = index_1;
//                nums[index_1] = nums[i+1];
//                nums[index_2] = nums[i+1];
//            }
//            else{
//                if(index_1 == index_2){
//                    index_2++;
//                    nums[index_2] = nums[i+1];
//                }
//            }
//            i++;
//        }
//        return index_2+1;
    }

    public static int MajorityElement(int[] nums){
//      Moore Voting Algorithm: O(N)
        int count = 0;
        int candidate = nums[0];
        for(int currentElement : nums){
            if(count == 0){
                candidate = currentElement;
                count++;
            }
            else if(candidate == currentElement){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
