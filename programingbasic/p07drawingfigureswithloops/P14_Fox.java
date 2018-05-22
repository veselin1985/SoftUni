package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P14_Fox {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int lenght = 2 * n + 3;

        for (int i = 1; i <= n; i++) {
            System.out.println(repeatStr("*", i) + "\\" + repeatStr("-", lenght - (2 * i) - 2) + "/" + repeatStr("*", i));
        }

        for (int i = 0; i < n/3 ; i++){
        int midStars = lenght - 2*(n/2+i)-4;
            System.out.println("|"+repeatStr("*", n/2+i) + "\\" +repeatStr("*", midStars)+"/" + repeatStr("*", n/2+i)+"|");

        }



        for (int i = 1; i <= n; i++) {
            System.out.println(repeatStr("-", i) + "\\" + repeatStr("*", lenght - (2 * i) - 2) + "/" + repeatStr("-", i));
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
