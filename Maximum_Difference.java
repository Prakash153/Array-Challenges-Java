package ArrayChallenges;

import java.util.Scanner;

public class Maximum_Difference {
    static int maxD(int a[]) {
        int res = a[1] - a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            res = Math.max(res, a[i] - min);
            min = Math.min(min, a[i]);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(maxD(a));
    }
}
