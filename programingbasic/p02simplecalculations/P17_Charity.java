package programingbasic.p02simplecalculations;

import java.util.Scanner;

public class P17_Charity {

    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);

        int days = Integer.parseInt(console.nextLine());
        int sweetWorkers = Integer.parseInt(console.nextLine());
        int cakes = Integer.parseInt(console.nextLine());
        int gofrets = Integer.parseInt(console.nextLine());
        int pancackes = Integer.parseInt(console.nextLine());

        double sumCackes = cakes*45;
        double sumGofrets = gofrets*5.80;
        double sumPancakes = pancackes*3.20;

        double sumTotalPerDay = (sumCackes + sumGofrets + sumPancakes)* sweetWorkers;
        double sumTotal = sumTotalPerDay*days;

        double sumDonation = sumTotal -(sumTotal/8);

        System.out.printf("%.2f", sumDonation);




    }
}
