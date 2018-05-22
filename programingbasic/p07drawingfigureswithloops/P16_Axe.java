package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P16_Axe {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int weigth = n * 5;


        for (int i = 0; i < n; i++) {
            int rightMinus = weigth - (3 * n) - 2 - i;
            System.out.println(repeatStr("-", 3 * n) + "*" + repeatStr("-", i) + "*" + repeatStr("-", rightMinus));
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.println(repeatStr("*", 3 * n) + "*" + repeatStr("-", n - 1) + "*" + repeatStr("-", n - 1));

        }
        for (int i = 0; i < n / 2; i++) {
            int midPart = weigth - (3 * n - i) - (n - 1 - i)-2;
            if (i == n / 2-1) {
                System.out.println(repeatStr("-", 3 * n - i) + "*" + repeatStr("*", midPart) + "*" + repeatStr("-", n - 1-i));


            } else {
                System.out.println(repeatStr("-", 3 * n - i) + "*" + repeatStr("-", midPart) + "*" + repeatStr("-", n - 1 -i));

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
