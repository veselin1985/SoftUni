package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P13_House {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());


        if (n % 2 == 0)
            for (int i = 1; i < ((n + 1) / 2)+1; i++) {
                System.out.println(repeatStr("-", (n - 2*i) / 2) + repeatStr("*", 2*i) + repeatStr("-", (n-2*i) / 2));
            } else {
            for (int i = 1; i < ((n + 1) / 2)+1; i++)
            {
                System.out.println(repeatStr("-", ((n+1)/2-i)) + repeatStr("*",2*i-1) + repeatStr("-", ((n+1)/2-i)));
            }

        }
        for (int i = 0; i < n-((n + 1) / 2 ) ; i++) {

            System.out.println("|"+repeatStr("*", n-2)+"|");


        }
    }


    private static String repeatStr(String text, int countToRepeat) {
        return getString(text, countToRepeat);
    }

    private static String getString(String text, int countToRepeat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {

            sb.append(text);

        }
        return sb.toString();
    }
}

