package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P10_Number100_200 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        if (number < 100) {
            System.out.println("Less than 100");
        }if (number >= 100 && number <= 200) {
            System.out.println("Between 100 and 200");
        }if (number > 200) {
            System.out.println("Greater than 200");
        }
    }
}