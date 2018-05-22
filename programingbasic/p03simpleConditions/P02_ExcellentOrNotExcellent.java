package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P02_ExcellentOrNotExcellent {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double result = Double.parseDouble(console.nextLine());
        double a = 5.50;

        if (result >= a) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
    }
}