package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P21_MultiplyTable {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        int a = num % 10;
        int b = (num / 10) % 10;
        int c = num / 100;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++)
                for (int k = 1; k <= c; k++) {
                    int sum = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, sum);

                }

        }

    }
}

