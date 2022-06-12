package ArrayChallenges2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeftRotateArrayByD {
    public static void LeftRotated(int a[], int n, int d) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];
        }
        for (int i = d; i < n; i++) {
            a[i - d] = a[i];
        }
        for (int i = 0; i < d; i++) {
            a[n - d + i] = temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the value for d ");
        int d = sc.nextInt();
        LeftRotated(a, n, d);
    }
}
