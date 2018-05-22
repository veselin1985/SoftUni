package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P12_Fibonacci {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int sum = 0;
        int num1 = 1;
        int num2 = 1;

        if (n < 2) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n; i++) {
                sum = num1 + num2;

                num2 = num1;
                num1 = sum;

            }
            System.out.println(sum);
        }
    }
}
