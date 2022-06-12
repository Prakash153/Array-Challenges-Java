package ArrayChallenges;

import java.util.*;

//this is a brute force method
public class SquareOfSortedArray {

    public static void main(String args[]) {
        int nums[] = {-4, -1, 0, 3, 10};

        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
