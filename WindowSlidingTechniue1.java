package ArrayChallenges2;

import java.util.Scanner;

// print the max sum of subarray of length k
public class WindowSlidingTechniue1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("value for K :");
        int k = sc.nextInt();
        int sum = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        for (int i = k; i < n; i++) {
            sum += (a[i] - a[i - k]); // we add next element and subtract first element of the previous subarray
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println(maxsum);
    }
}
