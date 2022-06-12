package ArrayChallenges2;

import java.util.Scanner;

public class FirstAndLastOccurence {
    public static void main(String args[]) {
        System.out.printf("size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("element to be searched :");
        int k = sc.nextInt();
        int low = 0;
        int hig = n - 1;
        while (low <= hig) {
            int mid = (low + hig) / 2;
            if (a[mid] != a[mid - 1] && a[mid] == k) {
                System.out.println(mid);
                break;
            } else if (a[mid] >= k) {
                hig = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }

}
