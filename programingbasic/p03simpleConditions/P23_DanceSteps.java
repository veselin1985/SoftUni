package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P23_DanceSteps {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int steps = Integer.parseInt(console.nextLine());
        int dancers = Integer.parseInt(console.nextLine());
        int days = Integer.parseInt(console.nextLine());

        double totalSteps= (steps/days);
        double totalSteps1 = Math.ceil((totalSteps/steps)*100);
        double stepsPerDay = totalSteps1/dancers;

        if (totalSteps1 <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", stepsPerDay);

        }else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", stepsPerDay);
        }




    }
}
