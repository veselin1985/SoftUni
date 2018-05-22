package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P05_Frame {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());


            System.out.println("+" + repeatStr(" -", n-2) + " +");
        for (int i = 0; i <n-2 ; i++) {
            System.out.println("|" + repeatStr(" -", n-2) + " |");

        }System.out.println("+" + repeatStr(" -", n-2) + " +");
    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {

            sb.append(text);

        }
        return sb.toString();
    }
}




