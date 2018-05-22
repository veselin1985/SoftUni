package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P27_ExternalEvaluation {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());


        double poorMarks = 0;
        double satisfactoryMarks = 0;
        double goodMarks = 0;
        double veryGoodMarks = 0;
        double excellentMarks = 0;

        for (int i = 0; i < n; i++) {

            double result = Double.parseDouble(console.nextLine());

            if (result < 22.50) {
                poorMarks++;
            } else if (result < 40.50) {
                satisfactoryMarks++;
            } else if (result < 58.50) {
                goodMarks++;
            } else if (result < 76.50) {
                veryGoodMarks++;
            } else if (result <= 100.00) {
                excellentMarks++;


            }





        }System.out.printf("%.2f%% poor marks%n", ((poorMarks/n)*100));
        System.out.printf("%.2f%% satisfactory marks%n", ((satisfactoryMarks/n)*100));
        System.out.printf("%.2f%% good marks%n",((goodMarks/n)*100));
        System.out.printf("%.2f%% very good marks%n", ((veryGoodMarks/n)*100));
        System.out.printf("%.2f%% excellent marks%n", ((excellentMarks/n)*100));
    }
}