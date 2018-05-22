package programingbasic.p04complexconditions;

import java.util.Scanner;

public class P05_InvalidNumber {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());

        if (a == 0 || a >= 100 && a <= 200) {
            System.out.println("");
        } else {
            System.out.println("invalid");

        }
    }
}
