package ArrayChallenges2;

import java.util.Scanner;

public class MaxCircularSubarraySum {
    static int kadanes(int a[], int n) {
        int maxEnd = a[0];
        int maxSum = a[0];
        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(maxEnd + a[i], a[i]);
            maxSum = Math.max(maxSum, maxEnd);
        }
        return maxSum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int normal_max_sum = kadanes(a, n);
        if (normal_max_sum < 0) {
            System.out.println("maximum circular subarray sum is :" + normal_max_sum);
            return;
        }
        int circular_sum = 0;
        int arr_sum = 0;
        for (int i = 0; i < n; i++) {
            arr_sum += a[i];
            a[i] = -a[i];
        }
        circular_sum = arr_sum + kadanes(a, n);
        System.out.println("maximum circular subarray sum is : " + Math.max(circular_sum, normal_max_sum));

    }
}
