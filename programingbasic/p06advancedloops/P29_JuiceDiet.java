package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P29_JuiceDiet {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int raspberries = Integer.parseInt(console.nextLine());
        int strawberries = Integer.parseInt(console.nextLine());
        int cherry = Integer.parseInt(console.nextLine());
        int juice = Integer.parseInt(console.nextLine());

        double maxJuice = 0;

        int rCounter = 0;
        int sCounter = 0;
        int cCounter = 0;


        for (int i = 0; i <= cherry; i++) {
            for (int j = 0; j <= strawberries; j++) {
                for (int k = 0; k <= raspberries; k++) {

                    double currentJuice = i * 15 + j * 7.5 + k * 4.5;

                    if (currentJuice <= juice) {
                        if (currentJuice > maxJuice) {
                            maxJuice = currentJuice;


                        }
                        if (currentJuice >= maxJuice) {
                            rCounter = k;
                            sCounter = j;
                            cCounter = i;


                        }
                    }

                }

            }



        } System.out.printf("%d Raspberries, %d Strawberries, %d Cherries. Juice: %.0f ml.", rCounter, sCounter, cCounter, maxJuice);

    }
}

