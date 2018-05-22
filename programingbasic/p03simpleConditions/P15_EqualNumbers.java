package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P15_EqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number1 = Integer.parseInt(console.nextLine());
        int number2 = Integer.parseInt(console.nextLine());
        int number3 = Integer.parseInt(console.nextLine());

        if (number1 == number2 && number1 == number3) {
            System.out.println("yes");
        } else System.out.println("no");
    }
}