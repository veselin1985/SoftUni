package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P23_TwoNumbersSum {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int start = Integer.parseInt(console.nextLine());
        int finish = Integer.parseInt(console.nextLine());
        int magicNumber = Integer.parseInt(console.nextLine());

        int counter = 0;

        boolean noMatch = true;
        for (int i = start; i >= finish; i--) {
            for (int j = start; j >= finish; j--) {
                counter++;
                if (i + j == magicNumber) {
                    noMatch = false;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    return;

                }

            }

        }
        if (noMatch) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);

        }
    }
}
