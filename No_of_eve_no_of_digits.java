package ArrayChallenges;

import java.util.Scanner;

public class No_of_eve_no_of_digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int eve = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int num = a[i];
            while (num > 0) {
                num = num / 10;
                count++;
            }
            if (count % 2 == 0) {
                eve++;
            }
        }
        System.out.println(eve);
    }
}
