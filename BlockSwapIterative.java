package ArrayChallenges;

import java.util.Scanner;

public class BlockSwapIterative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("steps: ");
        int r = sc.nextInt();
        int arr[] = rotateLeft(a, r, n);
        printArray("rotated array : ", arr);
    }

    public static void printArray(String msg, int a[]) {
        System.out.printf(msg);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println("");
    }

    public static void swap(int a[], int aIndex, int bIndex, int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            temp = a[aIndex + i];
            a[aIndex + i] = a[bIndex + i];
            a[bIndex + i] = temp;
        }
    }

    public static int[] rotateLeft(int arr[], int r, int n) {
        r %= n;
        if (n == 0 || r == n) {
            return arr;
        }
        int A = r, B = n - r;
        while (A != B) {
            if (A < B) {
                swap(arr, r - A, r - A + B, A);
                B = B - A;
            } else {
                swap(arr, r - A, r, B);
                A = A - B;
            }
        }
        swap(arr, r - A, r, A);
        return (arr);
    }
}