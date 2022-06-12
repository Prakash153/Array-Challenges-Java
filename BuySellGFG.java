package ArrayChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class BuySellGFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                list.add(i - 1);
                while (i < n && a[i] > a[i - 1]) {
                    i++;
                }
                list.add(i - 1);
                ans.add(list);
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.printf("%d ", ans.get(i).get(j));
            }
            System.out.println("");
        }
    }
}
