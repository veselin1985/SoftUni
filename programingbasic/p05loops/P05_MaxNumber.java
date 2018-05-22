package programingbasic.p05loops;

import java.util.Scanner;

public class P05_MaxNumber {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {

            int currentNUmber = console.nextInt();

            if (currentNUmber > maxNumber) {
                maxNumber=currentNUmber;
            }

        }System.out.println(maxNumber);
    }
}
