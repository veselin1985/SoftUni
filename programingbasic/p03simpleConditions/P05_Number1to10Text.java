package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P05_Number1to10Text {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        if (number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else if (number == 3) {
            System.out.println("three");
        } else if (number == 4) {
            System.out.println("four");
        } else if (number == 5) {
            System.out.println("five");
        } else if (number == 6) {
            System.out.println("six");
        } else if (number == 7) {
            System.out.println("seven");
        } else if (number == 8) {
            System.out.println("eight");
        } else if (number == 9) {
            System.out.println("nine");
        } else {
            System.out.println("number too big");
        }
    }
}