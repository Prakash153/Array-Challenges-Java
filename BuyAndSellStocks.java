package ArrayChallenges;

import java.util.Scanner;

public class BuyAndSellStocks {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    temp = prices[j] - prices[i];

                }
                if (temp > max) {
                    max = temp;
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int r = maxProfit(a);
        System.out.printf("%d", r);
    }
}
