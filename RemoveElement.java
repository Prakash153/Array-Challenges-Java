package ArrayChallenges;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("enter the value: ");
        int val = sc.nextInt();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != val) {
                a[k] = a[i];
                k++;
            }
        }
        System.out.printf("%d", k);

    }
}
