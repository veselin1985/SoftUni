package programingbasic.p05loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_OddEvenPosition {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        double oddSum = 0;
        double oddMin = 1000000000;
        double oddMax = -1000000000;
        double evenSum = 0;
        double evenMin = 1000000000;
        double evenMax = -1000000000;
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(console.nextLine());

            if (i % 2 == 0) {
                evenSum += num;
                if (num < evenMin) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax = num;

                }

            } else {
                oddSum += num;
                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax) {
                    oddMax = num;
                }
            }
        }
        if (n == 0) {
            ;
            System.out.println("OddSum=0");
            System.out.println("OddMin=no");
            System.out.println("OddMax=no");
            System.out.println("EvenSum=0");
            System.out.println("EvenMin=no");
            System.out.println("EvenMax=no");
        } else if (n == 1) {
            System.out.printf("OddSum=%s%n", df.format(oddSum));
            System.out.printf("OddMin=%s%n", df.format(oddMin));
            System.out.printf("OddMax=%s%n", df.format(oddMax));
            System.out.println("EvenSum=0");
            System.out.println("EvenMin=no");
            System.out.println("EvenMax=no");
        } else if (n > 1) {
            System.out.printf("OddSum=%s%n", df.format(oddSum));
            System.out.printf("OddMin=%s%n", df.format(oddMin));
            System.out.printf("OddMax=%s%n", df.format(oddMax));
            System.out.printf("EvenSum=%s%n", df.format(evenSum));
            System.out.printf("EvenMin=%s%n", df.format(evenMin));
            System.out.printf("EvenMax=%s%n", df.format(evenMax));


        }
    }
}