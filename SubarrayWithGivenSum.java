package ArrayChallenges2;

import java.util.Scanner;

public class SubarrayWithGivenSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("given sum :");
        int sum = sc.nextInt();
        int curr_sum = 0;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (a[j] + a[i + 1] < sum) {
                curr_sum += a[i];
                if (curr_sum == sum) {
                    System.out.println("yes");
                }
            } else {
                curr_sum -= a[j++];
            }
        }
    }
}
