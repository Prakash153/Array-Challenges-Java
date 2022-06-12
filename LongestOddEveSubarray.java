package ArrayChallenges2;

import java.util.Scanner;

public class LongestOddEveSubarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 1;
        int max = 1;
        for (int i = 0; i < n - 1; i++) {
            if ((a[i] % 2 == 0 && a[i + 1] % 2 == 0) || (a[i] % 2 == 1 && a[i + 1] % 2 == 1)) {
                count = 1;
            } else {
                count++;
                max = Math.max(max, count);
            }
        }
        System.out.println(max);
    }
}
