package ArrayChallenges2;

import java.util.Scanner;

public class N_bonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("value for m :");
        int m = sc.nextInt();
        System.out.printf("value of n < m: ");
        int n = sc.nextInt();
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = 0;
        }
        a[n] = 1;
        a[n - 1] = 1;
        for (int i = n + 1; i < m; i++) {
            a[i] = 2 * a[i - 1] - a[i - n - 1];
        }
        for (int i = 0; i < m; i++) {
            System.out.printf("%d ", a[i]);
        }


    }

}
