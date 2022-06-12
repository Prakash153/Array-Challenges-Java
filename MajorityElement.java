package ArrayChallenges2;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // an element is called majority element is present more than N/2 times
        int count = 1;
        int maj = 0;
        for (int i = 1; i < n; i++) {
            if (a[maj] == a[i]) {
                count++;
            } else {
                count = 1;
                maj = i;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == a[maj]) {
                count++;
            }
        }
        if (count > n / 2) {
            System.out.println(a[maj]);
        } else {
            System.out.println("-1");
        }

    }
}
