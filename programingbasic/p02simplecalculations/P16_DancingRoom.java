package programingbasic.p02simplecalculations;

import java.util.Scanner;

public class P16_DancingRoom {

    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);

        double lenght = Double.parseDouble(console.nextLine());
        double weight = Double.parseDouble(console.nextLine());
        double side = Double.parseDouble(console.nextLine());

        double areaInCm = (lenght*100)*(weight*100);
        double bench = areaInCm/10;
        double wadraw = (side*100)*(side*100);

        double usedArea = areaInCm - bench -wadraw;
        double people = Math.floor((usedArea/(40+7000)));

        System.out.printf("%.0f",people);


    }
}
