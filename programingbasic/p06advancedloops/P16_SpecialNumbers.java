package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P16_SpecialNumbers {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int number = 1111;

        while (number < 9999) {

            int a = number % 10;
            int b = (number / 10) % 10;
            int c = (number / 100) % 10;
            int d = number / 1000;

            if (a != 0 && b != 0 && c != 0 && d != 0) {
                if (n % a == 0 && n % b == 0 && n % c == 0 && n % d == 0)
                    System.out.print(number + " ");
                number++;
            } else {
                number++;


            }

        }
    }
}


