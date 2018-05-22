package programingbasic.p04complexconditions;

import java.util.Scanner;

public class P12_Voleyball {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String year = console.nextLine().toLowerCase();
        double holidays = Double.parseDouble(console.nextLine());
        double weekends = Double.parseDouble(console.nextLine());

        if (year.equals("leap")) {

            double inSofia = (48 - weekends) * 0.75;
            double outSofia = holidays * 2 / 3;
            double totalPlay = (outSofia + inSofia + weekends) * 1.15;

            System.out.println(Math.floor(totalPlay));

        } else if (year.equals("normal")) {

            double inSofia = (48 - weekends) * 0.75;
            double outSofia = holidays * 2 / 3;
            double totalPlay = (outSofia + inSofia + weekends);

            System.out.printf("%.0f",Math.floor(totalPlay));
        }
    }
}