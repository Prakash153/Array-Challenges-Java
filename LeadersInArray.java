package ArrayChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int max = a[n - 1];
        list.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > max) {
                list.add(a[i]);
                max = a[i];
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d ", list.get(i));
        }
    }
}
