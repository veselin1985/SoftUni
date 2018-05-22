package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P02_NumsNto1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());


        for (int i = n; i >= 1; i--) {

            System.out.println(i);

        }
    }
}
