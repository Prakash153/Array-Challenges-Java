package ArrayChallenges;

import java.util.Scanner;

public class MaxTill_i {
    /* Given an array of size n for every i from 0 to n-1 output max(a[0]....a[i])
     * ex: 1 0 5 4 6 8
     * i=  0 1 2 3 4 5
     * max= 1 1 5 5 6 8
     * 5 because max till 4 that is 1 0 5 4 is 5
     *
     * */

    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int mx = -199999;
        for (int i = 0; i < n; i++) {

            mx = max(mx, a[i]);
            System.out.printf("%d ", mx);
        }
    }
}


