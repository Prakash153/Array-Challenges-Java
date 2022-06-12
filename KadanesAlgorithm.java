package ArrayChallenges2;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
