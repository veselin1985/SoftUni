package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P06_RhombusOfStars {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int row = 1; row <=n ; row++) {
            System.out.print(repeatStr(" ", n - row) + "*" + repeatStr(" *", row - 1));
            System.out.println();

        } for (int row = n-1; row >=1 ; row--) {
            System.out.print(repeatStr(" ", n - row) + "*" + repeatStr(" *", row - 1));
            System.out.println();

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
