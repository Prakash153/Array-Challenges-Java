package ArrayChallenges2;

import java.util.Scanner;

public class MaxSubarraySumOfK {
    public static void main(String args[]) {
        System.out.printf("size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("value for K :");
        int k = sc.nextInt();
        int sum;
        int maxsum = 0;
        for (int i = 0; i + k - 1 < n; i++) {
            sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a[j + i];
            }
            maxsum = Math.max(sum, maxsum);
        }
        System.out.println(maxsum);
    }
}
