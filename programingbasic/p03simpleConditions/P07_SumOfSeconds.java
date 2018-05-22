package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P07_SumOfSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int time1 = Integer.parseInt(console.nextLine());
        int time2 = Integer.parseInt(console.nextLine());
        int time3 = Integer.parseInt(console.nextLine());
        int totalTime = time1 + time2 + time3;
        int min = 0;

        if (totalTime > 59) {
            totalTime = totalTime - 60;
            min = min + 1;
        }
        if (totalTime > 59) {
            totalTime = totalTime - 60;
            min = min + 1;
        }
        if (totalTime < 10) {
            System.out.printf(min + ":0" + totalTime);
        } else {
            System.out.printf(min + ":" + totalTime);
        }


    }
}
