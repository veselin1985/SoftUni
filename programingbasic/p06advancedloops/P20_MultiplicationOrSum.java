package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P20_MultiplicationOrSum {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        boolean isNO = true;
        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    if ((a + b + c == n) && ((a < b) && (a < c) && (b < c))) {
                        isNO = false;
                        System.out.printf("%d + %d + %d = %d%n", a, b, c, n);

                    }
                    if ((a * b * c == n) && ((a > b) && (a > c) && (b > c))) {
                        isNO = false;
                        System.out.printf("%d * %d * %d = %d%n", a, b, c, n);

                    }


                }

            }

        }
        if (isNO) {
            System.out.println("No!");

        }
    }
}
