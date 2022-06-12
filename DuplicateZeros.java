package ArrayChallenges;

import java.util.Scanner;

public class DuplicateZeros {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res[] = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a[i]);

        }
        for (int i = 0; i < n; i++) {
            if (a[index] != 0) {
                res[i] = a[index];
            } else {
                res[i] = 0;
                if (i + 1 < n) {
                    res[i + 1] = 0;
                    i = i + 1;
                }

            }
            index++;
        }
        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", res[i]);
        }
    }

}
