package programingbasic.p02simplecalculations;

import java.util.Scanner;

public class P13_CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double sum = Double.parseDouble(console.nextLine());
        String firstCurrency = console.nextLine();
        String secondCurrency = console.nextLine();
        double USD = 1.79549;
        double EUR = 1.95583;
        double GBP = 2.53405;


        if (firstCurrency.equals("USD")) {
            sum = sum * USD;
        } else if (firstCurrency.equals("EUR")) {
            sum = sum * EUR;
        } else if (firstCurrency.equals("GBP")) {
            sum = sum * GBP;
        } else if (firstCurrency.equals("BGN")) {
            sum = sum;
        }
        if (secondCurrency.equals("USD")) {
            sum = sum / USD;
        } else if (secondCurrency.equals("EUR")) {
            sum = sum / EUR;
        } else if (secondCurrency.equals("GBP")) {
            sum = sum / GBP;
        } else if (secondCurrency.equals("BGN")) {
            sum = sum;
        }
        System.out.printf("%.2f %s",sum, secondCurrency);
    }

}
