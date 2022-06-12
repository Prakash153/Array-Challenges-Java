package ArrayChallenges2;

import java.util.Scanner;

public class frequency {
    public static void main(String args[]) {
        System.out.printf("size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("value for k ");
        int k = sc.nextInt();
        int fre[] = new int[n];
        for (int i = 0; i < n; i++) {
            fre[a[i]]++;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", fre[i]);
        }
    }
}
