package programingbasic.p04complexconditions;

import java.util.Scanner;

public class P15_MoneyAward {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        double sum = Double.parseDouble(console.nextLine());

        int sumOfParts = 0;

        for (int i = 1; i <= n; i++) {
            int part = Integer.parseInt(console.nextLine());
            if (i % 2 == 0) {
                sumOfParts += part * 2;
            } else {
                sumOfParts += part;
            }

        } double total = sum*sumOfParts;
        System.out.printf("The project prize was %.2f lv.", (total) );
    }
}
