package ArrayChallenges2;

import java.util.Scanner;

public class MaximiseConsecutiveOnes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf(" value of k: ");
        int k = sc.nextInt();
        int ans = 0;
        int len = 0;
        int j = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            }
            while (count > k) {
                j++;
                if (a[j] == 0) {
                    count--;
                }
            }
            len = i - j;
            if (len > ans) {
                ans = len;
            }
        }
        System.out.println(ans);
    }
}
