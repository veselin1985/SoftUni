package programingbasic.p05loops;

import java.util.Scanner;

public class P12_EqualPairs {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int totalNumber = 0;
        int totalNumber2 = 0;
        int difference = 0;
        int maxDiff =0;

        for (int i = 0; i < n; i++) {
            totalNumber = totalNumber2;
            totalNumber2 = 0;

            totalNumber2 += console.nextInt();
            totalNumber2 += console.nextInt();



            if (i != 0) {
                difference = Math.abs(totalNumber - totalNumber2);
                if (difference != 0 && difference > maxDiff) {
                    maxDiff = difference;
                }

            }
        }if (totalNumber==totalNumber2 || n==1) {
            System.out.printf("Yes, value=%d", totalNumber2);
        }else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}