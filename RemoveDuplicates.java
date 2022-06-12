package ArrayChallenges;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[k]) {
                a[++k] = a[i];
            }
        }
        for (int i = 0; i < k + 1; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
