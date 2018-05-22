package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P24_WorldRecord {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double recordTime = Double.parseDouble(console.nextLine());
        double distance = Double.parseDouble(console.nextLine());
        double timeFor1m = Double.parseDouble(console.nextLine());

        double timeIvancho = distance*timeFor1m;
        double timeIvancho1 = Math.floor((distance/15));
        double timeIvanchoFinal = ((timeIvancho) + (timeIvancho1)*12.50);

        if (recordTime <= timeIvanchoFinal) {
            double timeDif =  timeIvanchoFinal - recordTime;

            System.out.printf("No, he failed! He was %.2f seconds slower.", timeDif);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeIvanchoFinal);
        }
    }


}
