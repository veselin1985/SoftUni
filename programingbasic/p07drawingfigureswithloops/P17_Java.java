package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P17_Java {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int width = 3 * n + 6;
        int length = 3 * n + 1;

        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr(" ", n) + "~ ~ ~" + repeatStr(" ", width - n - 5));
        }
        System.out.println(repeatStr("=", width - 1));
        for (int i = 1; i <= n - 2; i++) {
            if (i == (n) / 2) {
                System.out.println("|" + repeatStr("~",  (width-n-6)/2 )+"JAVA"+ repeatStr("~",  (width-n-6)/2)+"|" + repeatStr(" ", n - 1) + "|");
            } else {
                System.out.println("|" + repeatStr("~", 2 * n + 4) + "|" + repeatStr(" ", n - 1) + "|");
            }
        }System.out.println(repeatStr("=", width - 1));
        for (int i = 0; i <n ; i++) {
            int midSign = width-2-n-2*i;
            System.out.println(repeatStr(" ", i)+"\\"+repeatStr("@", midSign)+"/");



        }
        System.out.println(repeatStr("=", width-n));


    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {

            sb.append(text);

        }
        return sb.toString();
    }
}
