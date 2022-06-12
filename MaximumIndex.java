package ArrayChallenges2;

import java.util.Scanner;

public class MaximumIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int j = n / 2;
        int currmax = 0;
        int maxdiff = 0;
        int i = 0;
        while (i < n / 2) {
            if (a[i] < a[j]) {
                currmax = j - i;
                maxdiff = Math.max(currmax, maxdiff);
            } else if (a[i] > a[j]) {
                i++;
            } else {
                if (j < n) {
                    j++;
                }
            }
        }
        System.out.println(maxdiff);
    }
}
