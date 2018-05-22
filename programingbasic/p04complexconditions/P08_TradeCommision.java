package programingbasic.p04complexconditions;

import java.util.Scanner;

public class P08_TradeCommision {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String city = console.nextLine().toLowerCase();
        double sales = Double.parseDouble(console.nextLine());

        double commision = -1;

        if (city.equals("sofia")) {
            if (sales >= 0 && sales <= 500) {
                commision = 0.05;
            } else if (sales > 500 && sales <= 1000) {
                commision = 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                commision = 0.08;
            } else if (sales > 10000) {
                commision = 0.12;
            }

        } else if (city.equals("varna")) {
            if (sales >= 0 && sales <= 500) {
                commision = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                commision = 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                commision = 0.10;
            } else if (sales > 10000) {
                commision = 0.13;
            }

        } else if (city.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commision = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                commision = 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                commision = 0.12;
            } else if (sales > 10000) {
                commision = 0.145;
            }
        }
        if (commision == -1) {
            System.out.println("error");
        } else {
            double result = sales * commision;
            System.out.printf("%.2f", result);
        }
    }

}