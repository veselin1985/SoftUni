package programingbasic.p07drawingfigureswithloops;

import java.util.Scanner;

public class P09_House {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        if (n % 2 == 0) {
            System.out.println();

            for (int i = 0; i < n - 2; i++) {


            }

        }
    }
        static String repeatStr (String text,int countToRepeat){
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < countToRepeat; i++) {

                sb.append(text);

            }
            return sb.toString();
        }
    }



