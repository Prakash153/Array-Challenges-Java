package ArrayChallenges;

import java.util.Scanner;
import java.util.*;

public class MinimizeMaxPairSum {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            res = Math.max(res, nums[i] + nums[nums.length - 1 - i]);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("%d", minPairSum(a));

    }
}
