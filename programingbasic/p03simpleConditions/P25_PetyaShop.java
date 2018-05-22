package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P25_PetyaShop {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double trip = Double.parseDouble(console.nextLine());
        int puzzles = Integer.parseInt(console.nextLine());
        int dolls = Integer.parseInt(console.nextLine());
        int bears = Integer.parseInt(console.nextLine());
        int minions = Integer.parseInt(console.nextLine());
        int trucks = Integer.parseInt(console.nextLine());


        double totalOrder = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);
        double qty = puzzles + dolls + bears + minions + trucks;
        double orderDiscount = totalOrder - (totalOrder * 0.25);
        double savingDicount = orderDiscount - (orderDiscount * 0.1);
        double totalOrderSaving = totalOrder - (totalOrder * 0.1);

        if (qty >= 50) {
            if (savingDicount >= trip) {

                double dif = savingDicount - trip;
                System.out.printf("Yes! %.2f lv left.", dif);

            } else {
                double dif = trip - savingDicount;
                System.out.printf("Not enough money! %.2f lv needed.", dif);


            }
        } else {
            if (totalOrderSaving >= trip) {

                double dif = totalOrderSaving - trip;
                System.out.printf("Yes! %.2f lv left.", dif);

            } else {
                double dif = trip - totalOrderSaving;
                System.out.printf("Not enough money! %.2f lv needed.", dif);
            }

        }
    }
}
