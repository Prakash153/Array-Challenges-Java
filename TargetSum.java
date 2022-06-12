package ArrayChallenges2;

import java.util.*;
import java.util.Scanner;

public class TargetSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("sizze of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("target sum :");
        int k = sc.nextInt();
        Arrays.sort(a);
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (a[i] + a[j] < k) {
                i++;
            } else if (a[i] + a[j] > k) {
                j--;
            } else {
                System.out.printf("%d", a[i]);
                System.out.printf("\n%d", a[j]);
                break;
            }
        }
    }
}
