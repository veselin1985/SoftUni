package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P01_Ractangle10x10Stars {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = 10;

        for (int i = 0; i <10 ; i++) {
            System.out.println(repeatStr("*", 10));

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
