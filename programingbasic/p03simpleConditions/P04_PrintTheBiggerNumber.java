package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P04_PrintTheBiggerNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        if (a > b) {
            System.out.println("Greater number: " + a);
        } else {
            System.out.println("Greater number: " + b);
        }
    }
}
