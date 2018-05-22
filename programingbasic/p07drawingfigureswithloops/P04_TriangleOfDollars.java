package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P04_TriangleOfDollars {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <=n ; i++) {
            System.out.println(repeatStr("$ ", i));

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


