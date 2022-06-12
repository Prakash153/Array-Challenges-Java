package ArrayChallenges2;

import java.util.Scanner;

public class TripletSum {
    // write a program to find a pair of triplet sum in array that is  1 + 1 -2 = 0
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // time complexity of this approach is O(N^2)
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                if (sum == 0) {
                    System.out.println(a[i] + "+" + a[j] + "+" + a[k] + "= 0");
                    break;
                } else if (sum > 0) {
                    k--;
                } else {
                    j--;
                }
            }
        }
    }
}
