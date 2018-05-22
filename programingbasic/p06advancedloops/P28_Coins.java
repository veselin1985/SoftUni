package programingbasic.p06advancedloops;

import java.math.BigDecimal;
import java.util.Scanner;

public class P28_Coins {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);


        double change = Double.parseDouble(console.nextLine());


        int counter = 0;

        while (change>0.00) {

            if (change >= 2) {
                BigDecimal.valueOf(change-=2);
                counter++;
            }
            if (change < 2 && change >= 1 ){
                BigDecimal.valueOf(change -= 1);
                counter++;
            }
            if (change < 1 && change >= 0.50) {
               BigDecimal.valueOf(change -= 0.50);
                counter++;

            }
            if (change < 0.50 && change >= 0.20) {
                BigDecimal.valueOf(change -= 0.20);
                counter++;
            }
            if (change < 0.20 && change >= 0.10) {
               BigDecimal.valueOf(change -= 0.10);
                counter++;

            }
            if (change < 0.10&& change >= 0.05 ){
                BigDecimal.valueOf(change -= 0.05);
                counter++;
            }

            if (change < 0.05 && change >= 0.02) {
                BigDecimal.valueOf(change -= 0.02);
                counter++;
            }
            if (change < 0.02 && change > 0.009) {
               BigDecimal.valueOf(change -= 0.01);
                counter++;

            } if (change < 0.005) {
                change = 0;
            }
        }
        System.out.println(counter);
    }
}
