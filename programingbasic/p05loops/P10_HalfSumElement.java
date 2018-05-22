package programingbasic.p05loops;

import java.util.Scanner;

public class P10_HalfSumElement {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;


        for (int i = 0; i < n; i++) {
            int currentNumber = console.nextInt();

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
                sum += currentNumber;

            } else {
                sum += currentNumber;
            }

        }
        if ((sum - maxNumber) == maxNumber) {
            System.out.printf("Yes Sum = %d", maxNumber);
        } else {
            System.out.printf("No Diff = %d", Math.abs(sum - maxNumber - maxNumber));
        }
    }
}
