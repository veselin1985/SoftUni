package programingbasic.p05loops;

import java.util.Scanner;

public class P08_OddEvenSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {

            int currentNumber = console.nextInt();
            if (i % 2 ==0) {
                evenSum +=currentNumber;

            } else {
                oddSum += currentNumber;
            }
        }
        if (evenSum == oddSum) {
            System.out.printf("Yes, sum = %d", oddSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(evenSum - oddSum));

        }


    }
}

