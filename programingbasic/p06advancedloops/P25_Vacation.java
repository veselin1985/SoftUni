package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P25_Vacation {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());

        String season = console.nextLine();

        if (budget <= 1000) {
            if (season.equals("Summer")) {
                System.out.printf("Alaska - Camp - %.2f", (budget * 0.65));
            } else {
                System.out.printf("Morocco - Camp - %.2f", (budget * 0.45));
            }
        } else if (budget <= 3000) {
            if (season.equals("Summer")) {
                System.out.printf("Alaska - Hut - %.2f", (budget * 0.80));
            } else {
                System.out.printf("Morocco - Hut - %.2f", (budget * 0.60));
            }
        } else {
            if (season.equals("Summer")) {
                System.out.printf("Alaska - Hotel - %.2f", (budget * 0.90));
            } else {
                System.out.printf("Morocco - Hotel - %.2f", (budget * 0.90));
            }
        }
    }
}

