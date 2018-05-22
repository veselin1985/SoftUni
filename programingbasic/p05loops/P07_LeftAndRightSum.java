package programingbasic.p05loops;

import java.util.Scanner;

public class P07_LeftAndRightSum {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < 2 * n; i++) {

            int currentNumber = console.nextInt();
            if (i < n) {
                leftSum +=currentNumber;

            } else {
                rightSum += currentNumber;
            }
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));

        }


    }
}

