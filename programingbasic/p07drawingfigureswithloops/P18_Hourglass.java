package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P18_Hourglass {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int width = 2 * n + 1;
        int length = 2 * n + 1;

        System.out.println(repeatStr("*", width));
        System.out.println(".*" + repeatStr(" ", width - 4) + "*.");

        for (int i = 2; i < n; i++) {

            System.out.println(repeatStr(".", i) + "*" + repeatStr("@", width - 2 * i - 2) + "*" + repeatStr(".", i));
        }
        System.out.println(repeatStr(".", n) + "*" + repeatStr(".", n));
        for (int i = 0; i < n - 2; i++) {
            System.out.println(repeatStr(".", (n - 1 - i)) + "*" + repeatStr(" ", i) + "@" + repeatStr(" ", i) + "*" + repeatStr(".", n - 1 - i));
        }
        System.out.println(".*"+repeatStr("@", width - 4)+"*.");
        System.out.println(repeatStr("*", width));



    }


    static String repeatStr(String text, int countToRepeat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {

            sb.append(text);

        }
        return sb.toString();
    }
}