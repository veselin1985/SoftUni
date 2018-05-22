package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P21_GarageCleaning {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double first = Double.parseDouble(console.nextLine());
        double second = Double.parseDouble(console.nextLine());
        double third = Double.parseDouble(console.nextLine());
        double fishingTime = Double.parseDouble(console.nextLine());

        double totalTime = (1 / (1 / first + 1 / second + 1 / third)) + (1 / (1 / first + 1 / second + 1 / third)) * 0.15;

        if (totalTime <= fishingTime) {

            double timeLeft = fishingTime - totalTime;

            System.out.printf("Cleaning time: %.2f%nYes, there is a surprise - time left -> %.0f hours.", totalTime, Math.floor(timeLeft));
        } else {
            double timeLimit = totalTime - fishingTime;

            System.out.printf("Cleaning time: %.2f%nNo, there isn't a surprise - shortage of time -> %.0f hours.", totalTime, Math.ceil(timeLimit));
        }
    }
}