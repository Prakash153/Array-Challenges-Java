package ArrayChallenges;

import java.util.Scanner;

public class RotateArrayLeetCode {
    static int reverse(int a[], int low, int high) {
        while (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        return a[low];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("No. of steps: ");
        int k = sc.nextInt();
        k %= n;
        reverse(a, 0, n - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a[i]);
        }

    }
}
