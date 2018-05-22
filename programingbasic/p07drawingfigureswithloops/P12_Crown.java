package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P12_Crown {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int witd = (2 * n) - 1;


        System.out.println("@" + repeatStr(" ", ((2 * n) - 4) / 2) + "@" + repeatStr(" ", ((2 * n) - 4) / 2) + "@");
        System.out.println("**" + repeatStr(" ", ((2 * n) - 5) / 2) + "*" + repeatStr(" ", ((2 * n) - 5) / 2) + "**");

        for (int i = 0; i <= n / 2 - 2; i++) {

            int midDots = (witd - (2 * ((witd - 9) / 2) - 2 * i)) - 9;
            if (i == n / 2 - 2) {
                System.out.println("*." + repeatStr(".", i) + "*" + repeatStr(" ", (((witd - 9) / 2 - 2 * i)))
                        + "." + repeatStr(".", midDots) + "*" + repeatStr(" ", (((witd - 9) / 2) - 2 * i)) +
                        "." + repeatStr(".", i) + "*");
            } else System.out.println("*." + repeatStr(".", i) + "*" + repeatStr(" ", (((witd - 9) / 2 - 2 * i)))
                    + "*." + repeatStr(".", midDots) + "*" + repeatStr(" ", (((witd - 9) / 2) - 2 * i)) +
                    "*." + repeatStr(".", i) + "*");


        }
        int starsLenght = (witd - n - 3)/2;
        System.out.println("*"+repeatStr(".", n/2)+ repeatStr("*", starsLenght)+"."+
                repeatStr("*", starsLenght)+repeatStr(".", n/2)+"*");
        System.out.println(repeatStr("*", (2 * n) - 1));
        System.out.println(repeatStr("*", (2 * n) - 1));

    }

   private static String repeatStr(String text, int countToRepeat) {
       return getString(text, countToRepeat);
    }

    private static String getString(String text, int countToRepeat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {

            sb.append(text);

        }
        return sb.toString();
    }
}







