package programingbasic.p02simplecalculations;

import java.util.Scanner;

public class P15_TailorWorkshop {

    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);

        double tables = Double.parseDouble(console.nextLine());
        double lenght = Double.parseDouble(console.nextLine());
        double hight = Double.parseDouble(console.nextLine());

        double area1 = tables*((lenght + 2*0.30)*(hight + 2*0.30));
        double area2 = tables*((lenght/2)*(lenght/2));

        double priceUSD = (area1*7)+(area2 * 9);
        double priceBGN = priceUSD*1.85;

        System.out.printf("%.2f USD%n%.2f BGN", priceUSD, priceBGN);



    }
}
