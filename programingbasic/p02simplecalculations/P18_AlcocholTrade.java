package programingbasic.p02simplecalculations;

import java.util.Scanner;

public class P18_AlcocholTrade {

    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);

        double priceWhiskey = Double.parseDouble(console.nextLine());
        double beer = Double.parseDouble(console.nextLine());
        double wine = Double.parseDouble(console.nextLine());
        double rakia = Double.parseDouble(console.nextLine());
        double whiskey = Double.parseDouble(console.nextLine());

        double priceRakia = priceWhiskey/2;
        double priceWine = priceRakia - (priceRakia*0.4);
        double priceBeer = priceRakia - (priceRakia*0.8);

        double sumRakia = rakia * priceRakia;
        double sumBeer = beer * priceBeer;
        double sumWine = wine * priceWine;
        double sumWhiskey = whiskey * priceWhiskey;

        double totalSum = sumRakia + sumBeer + sumWine + sumWhiskey;

        System.out.printf("%.2f", totalSum);



    }
}
