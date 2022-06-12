package ArrayChallenges2;

import java.util.Scanner;

public class PrefixSumForGivenRange {
    public static void main(String args[]) {
        System.out.printf("size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("Number of queries :");
        int q = sc.nextInt();
        System.out.printf("left indices :");
        int l[] = new int[q];
        for (int i = 0; i < 3; i++) {
            l[i] = sc.nextInt();
        }
        System.out.printf("right indices :");
        int r[] = new int[q];
        for (int i = 0; i < 3; i++) {
            r[i] = sc.nextInt();
        }


        int prefix_sum[] = new int[n];
        prefix_sum[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefix_sum[i] += prefix_sum[i - 1] + a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", prefix_sum[i]);
        }
        System.out.println("");
        for (int i = 0; i < q; i++) {
            if (l[i] != 0) {
                System.out.println("the sum between range " + l[i] + " and " + r[i] + " is " + (prefix_sum[r[i]] - prefix_sum[l[i] - 1]));
            } else {
                System.out.println("the sum between range " + l[i] + " and " + r[i] + " is " + prefix_sum[r[i]]);
            }
        }
    }
}
