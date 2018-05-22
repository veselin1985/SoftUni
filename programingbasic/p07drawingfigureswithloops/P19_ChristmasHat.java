package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P19_ChristmasHat {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int wigth = 4 * n + 1;
        int length = 2 * n + 5;


        System.out.println(repeatStr(".", (wigth - 3) / 2) + "/|\\" + repeatStr(".", (wigth - 3) / 2));
        System.out.println(repeatStr(".", (wigth - 3) / 2) + "\\|/" + repeatStr(".", (wigth - 3) / 2));

        for (int i = 0; i < 2 * n; i++) {
            int dots = (wigth - 3 - 2 * i) / 2;
            System.out.println(repeatStr(".", dots) + "*" + repeatStr("-", i) + "*" + repeatStr("-", i) + "*" + repeatStr(".", dots));
        }
        System.out.println(repeatStr("*", wigth));
        System.out.println("*"+repeatStr(".*", 2*n));
        System.out.println(repeatStr("*", wigth));
    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {

            sb.append(text);

        }
        return sb.toString();
    }
}
