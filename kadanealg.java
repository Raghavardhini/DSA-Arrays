//Kadane's algorithm
//input={2,3,-8,7,1,2,3} Output:11

import java.util.*;

public class Main {
    public static int kadaneAlg(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for(int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(kadaneAlg(arr));
    } c
}
