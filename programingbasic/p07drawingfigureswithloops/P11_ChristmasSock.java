package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P11_ChristmasSock {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int firstPart = 3;
        int secondPart = (3 * n + 3) / 2;
        int thirdPart = (3 * n + 3) / 2;

        if (n % 2 == 1) {
            System.out.println("|" + repeatStr("-", n * 2) + "|");
            System.out.println("|" + repeatStr("*", n * 2) + "|");
            System.out.println("|" + repeatStr("-", n * 2) + "|");

            for (int i = 1; i < n; i++) {
                System.out.println("|" + repeatStr("-", n - i) + repeatStr("~", i * 2) + repeatStr("-", n - i) + "|");
            }
            for (int i = n - 2; i >= 1; i--) {
                System.out.println("|" + repeatStr("-", n - i) + repeatStr("~", i * 2) + repeatStr("-", n - i) + "|");

            }
            for (int i = 0; i < n+3; i++) {


                if (i == (n / 2) + 2) {
                    System.out.println(repeatStr("-", i) + "\\" + repeatStr(".", n - 2) + "X-MAS" + repeatStr(".", n - 2) + "\\");

                } else if (i == n / 2) {
                    System.out.println(repeatStr("-", i) + "\\" + repeatStr(".", n - 2) + "MERRY" + repeatStr(".", n - 2) + "\\");

                } else if (i ==n+2)
                    System.out.println(repeatStr("-", i) + "\\" + repeatStr("_", 2 * n + 1) + ")");

                else System.out.println(repeatStr("-", i) + "\\" + repeatStr(".", 2 * n + 1) + "\\");
            }
        }
        if (n % 2 == 0) {

            System.out.println("|" + repeatStr("-", n * 2) + "|");
            System.out.println("|" + repeatStr("*", n * 2) + "|");
            System.out.println("|" + repeatStr("-", n * 2) + "|");

            for (int i = 1; i < n; i++) {
                System.out.println("|" + repeatStr("-", n - i) + repeatStr("~", i * 2) + repeatStr("-", n - i) + "|");
            }
            for (int i = n - 2; i >= 1; i--) {
                System.out.println("|" + repeatStr("-", n - i) + repeatStr("~", i * 2) + repeatStr("-", n - i) + "|");

            }
            for (int i = 0; i <=n+2; i++) {


                if (i == (n / 2) + 2) {
                    System.out.println(repeatStr("-", i) + "\\" + repeatStr(".", n - 2) + "X-MAS" + repeatStr(".", n - 2) + "\\");

                } else if (i == n / 2) {
                    System.out.println(repeatStr("-", i) + "\\" + repeatStr(".", n - 2) + "MERRY" + repeatStr(".", n - 2) + "\\");

                } else if (i == n+2)
                    System.out.println(repeatStr("-", i) + "\\" + repeatStr("_", 2 * n + 1) + ")");

                else System.out.println(repeatStr("-", i) + "\\" + repeatStr(".", 2 * n + 1) + "\\");
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



