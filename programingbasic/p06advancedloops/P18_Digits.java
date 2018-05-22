package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P18_Digits {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        int c = number % 10;
        int b = (number / 10) % 10;
        int a = number / 100;

        int row = a + b;
        int col = a + c;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (number % 5 == 0) {
                    number -= a;
                    System.out.print(number + " ");
                } else if (number % 3 == 0) {
                    number -= b;
                    System.out.print(number + " ");

                } else {
                    number += c;
                    System.out.print(number + " ");

                }

            }System.out.println();

        }
    }
}