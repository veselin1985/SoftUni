package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P08_Sunglasses {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        System.out.print(repeatStr("*", 2 * n) + repeatStr(" ", n) + repeatStr("*", 2 * n));
        System.out.println();

        for (int i = 0; i < n - 2; i++) {

            if (i == (n - 1) / 2 - 1){
                System.out.print("*" + repeatStr("/", (2 * n) - 2) + "*" + repeatStr("|", n) + ("*" + repeatStr("/", (2 * n) - 2)) + "*");
            System.out.println();
        } else  {
                System.out.print("*" + repeatStr("/", (2 * n) - 2) + "*" + repeatStr(" ", n) + ("*" + repeatStr("/", (2 * n) - 2)) + "*");
                System.out.println();


            }

        }System.out.print(repeatStr("*", 2 * n) + repeatStr(" ", n) + repeatStr("*", 2 * n));
        System.out.println();
    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {

            sb.append(text);

        }
        return sb.toString();
    }
}

