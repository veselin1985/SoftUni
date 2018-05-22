package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P20_Wine {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int grapes = Integer.parseInt(console.nextLine());
        double grapesM2 = Double.parseDouble(console.nextLine());
        int wineLiters = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());

        /*
        Общо грозде: 650 * 2 = 1 300
Вино = 40% * 1300 / 2,5 = 208
208 > 175
208 - 175 = 33 л остават -> 11 л на човек

         */
        double totalGrapes = grapes * grapesM2;
        double wineQty = (totalGrapes * 0.4) / 2.5;

        if (wineQty >= wineLiters) {
            double left =wineQty -wineLiters ;

            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n %.0f liters left -> %.0f liters per person.", Math.floor(wineQty), Math.ceil(left), Math.ceil(left / workers));
        } else {
            double result = wineLiters - wineQty;
            System.out.printf("It will be a tough winter! More %d liters wine needed.",(int)result);

        }
    }
}

