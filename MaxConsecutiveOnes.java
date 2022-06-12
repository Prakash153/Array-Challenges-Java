package ArrayChallenges;

public class MaxConsecutiveOnes {
    public static void main(String args[]) {
        int a[] = {1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1};
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        int count = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;

            } else
                count = 0;

            if (max < count) {
                max = count;
            }
        }
        System.out.println("");
        System.out.println(max);

    }
}
