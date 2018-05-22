package programingbasic.p05loops;

import java.util.Scanner;

public class P06_MinNumber {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i <n ; i++) {

            int currentNUmber = console.nextInt();

            if (currentNUmber < minNumber) {
                minNumber=currentNUmber;
            }

        }System.out.println(minNumber);
    }
}


