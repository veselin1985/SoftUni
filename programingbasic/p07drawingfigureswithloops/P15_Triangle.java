package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P15_Triangle {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int width = (2 * n) + 1;
        int length = (4 * n) + 1;

        System.out.println(repeatStr("#", length));

        for (int i = 1; i <= n * 2; i++) {
            int midSpaces = length - (2 * ((2 * n + 1) - i * 2)) - 2 * i;
            int midHash = length - 2 * i;
            int midSpacesSpecial = (midSpaces - 3) / 2;

            if (i > n) {
                System.out.println(repeatStr(".", i) + repeatStr("#", midHash) + repeatStr(".", i));
            }
            if (i == n / 2 + 1) {
                System.out.println(repeatStr(".", i) + repeatStr("#", (2 * n + 1) - i * 2) + repeatStr(" ", midSpacesSpecial) + "(@)" + repeatStr(" ", midSpacesSpecial) + repeatStr("#", (2 * n + 1) - i * 2) + repeatStr(".", i));
            } else if (i <= n) {
                System.out.println(repeatStr(".", i) + repeatStr("#", (2 * n + 1) - i * 2) + repeatStr(" ", midSpaces) + repeatStr("#", (2 * n + 1) - i * 2) + repeatStr(".", i));
            }

        }
    }


    static String repeatStr(String text, int countToRepeat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {

            sb.append(text);

        }
        return sb.toString();
    }
}