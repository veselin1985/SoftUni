package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P06_BonusPoints {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double points = Double.parseDouble(console.nextLine());
        double bonus = -1;


        if (points <= 100) {
            bonus = 5;
        } else if (points > 100 && points < 1000) {
            bonus = points * 0.2;
        } else {
            bonus = points * 0.1;
        }
        if (points % 2 == 0) {
            bonus = bonus + 1;
        } else if (points % 10 == 5) {
            bonus = bonus + 2;
        }
        double totalPoints = points + bonus;

        System.out.println(bonus);
        System.out.println(totalPoints);
    }
}
