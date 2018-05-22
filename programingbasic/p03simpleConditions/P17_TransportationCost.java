package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P17_TransportationCost {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int distance = Integer.parseInt(console.nextLine());
        String time = console.nextLine();
        double expense = 0;

        if (distance < 20) {
            if (time.equals("day"))

                expense = distance * 0.79 + 0.70;
            if (time.equals("night")) {
                expense = distance * 0.90 + 0.70;


            }
        } else if (distance < 100) {

            expense = distance * 0.09;
        } else
            expense = distance * 0.06;
        System.out.printf("%.2f", expense);
    }
}
