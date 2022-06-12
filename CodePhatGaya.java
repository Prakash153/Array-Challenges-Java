package ArrayChallenges;

import java.util.Scanner;

public class CodePhatGaya {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("target: ");
        int target = sc.nextInt();
        int ans[] = new int[2];
        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                ans[1] = i;
            } else {
                ans[1] = -1;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == target) {
                ans[0] = i;
            } else {
                ans[0] = -1;
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.printf("%d ", ans[i]);
        }

    }
}
