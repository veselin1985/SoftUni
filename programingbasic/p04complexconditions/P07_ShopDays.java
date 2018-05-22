package programingbasic.p04complexconditions;

import java.util.Scanner;

public class P07_ShopDays {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        String fruit = console.nextLine().toLowerCase();
        String days = console.nextLine().toLowerCase();
        double qty = Double.parseDouble(console.nextLine());

        double price = -1;

        if (days.equals("monday") || days.equals("tuesday") || days.equals("wednesday") || days.equals("thursday") || days.equals("friday")) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            }
        } else if (days.equals("saturday") || days.equals("sunday")) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;

            }
        }
        if (price == -1) {
            System.out.println("error");
        } else {
            double result = price * qty;
            System.out.printf("%.2f", result);
        }


    }
}
