package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P19_CatTom {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());

        int nonWokringDays = days * 127;
        int workingDays = (365 - days) * 63;

        int totalMin = nonWokringDays + workingDays;

        if (totalMin < 30000) {

            int playTime = 30000 - totalMin;

            int hours = playTime / 60;
            int min = playTime % 60;

            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, min);
        } else {

            int playTime = totalMin - 30000;

            int hours = playTime / 60;
            int min = playTime % 60;

            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, min);
        }
    }


}



