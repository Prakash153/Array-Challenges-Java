package ArrayChallenges2;

import java.util.Scanner;

public class CorrectKadanesAlgorithm {
    static int kadanes(int a[], int n) {
        int maxEnd = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(maxEnd + a[i], a[i]);
            max = Math.max(maxEnd, max);
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Max subarray sum is :" + kadanes(a, n));
    }
}
