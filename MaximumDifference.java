package ArrayChallenges2;

import java.util.Scanner;

public class MaximumDifference {
    public static int MaxDiff(int arr[], int n) {
        int res = arr[1] - arr[0];
        int minValue = arr[0];
        for (int j = 1; j < n; j++) {
            res = Math.max(res, arr[j] - minValue);
            minValue = Math.min(minValue, arr[j]);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the maximum difference in the array is : " + MaxDiff(arr, n));

    }
}
