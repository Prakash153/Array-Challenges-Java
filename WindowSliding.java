package ArrayChallenges2;

import java.util.Scanner;

// return the maximum   sum of consecutive elements of size k
public class WindowSliding {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value for k");
        int k = sc.nextInt();
        // the idea is to get the sum of first k elements and then move forward byt adding the next element and subtracting last element
        int curr_sum = 0;
        for (int i = 0; i < k; i++) {
            curr_sum += arr[i];
        }
        int max_sum = 0;
        for (int i = k; i < n; i++) {
            curr_sum += (arr[i] - arr[i - k]);

            max_sum = Math.max(max_sum, curr_sum);
        }
        System.out.println("the maximum sum with length k is : " + max_sum);
    }
}
