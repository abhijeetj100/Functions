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
}
