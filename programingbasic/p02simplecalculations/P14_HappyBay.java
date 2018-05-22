package programingbasic.p02simplecalculations;

import java.util.Scanner;

public class P14_HappyBay {

    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);

        double lenght = Double.parseDouble(console.nextLine());
        double weight = Double.parseDouble(console.nextLine());
        double hight = Double.parseDouble(console.nextLine());
        double persentage = Double.parseDouble(console.nextLine());

        double volume = lenght*weight*hight * 0.001;
        double percentage2 = persentage*0.01;

        double liters = volume *(1-percentage2);

        System.out.printf("%.3f", liters);


    }
}
