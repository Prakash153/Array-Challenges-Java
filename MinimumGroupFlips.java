package ArrayChallenges2;

import java.util.Scanner;

public class MinimumGroupFlips {
    static void MinimumFlips(int a[], int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                if (a[i] != a[0]) {
                    System.out.printf("from %d to ", i);
                } else {
                    System.out.printf("%d \n", i - 1);
                }
            }
        }
        if (a[n - 1] != a[0]) {

            System.out.printf("%d \n", n - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.printf("enter a boolean array :\n");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        MinimumFlips(a, n);


    }
}
