package ArrayChallenges;

import java.util.Scanner;

public class N {
    static void printN(int n) {
        if (n == 0) {
            return;
        }

        printN(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printN(n);
    }
}
