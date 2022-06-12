package ArrayChallenges2;

import java.util.Scanner;

public class StockBuySell {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min_value = Integer.MAX_VALUE;
        int max_value = 0;

        for (int i = 0; i < n; i++) {
            min_value = Math.min(a[i], min_value);
            max_value = Math.max(max_value, a[i] - min_value);
        }
        System.out.println("the maximum profit is : " + max_value);
    }
}

