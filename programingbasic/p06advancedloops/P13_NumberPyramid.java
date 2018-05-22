package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P13_NumberPyramid {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int counter = 1;

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(1);
            System.out.println(2);
        } else {

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {

                    if (counter > n) {
                        return;
                    } else {
                        System.out.print(counter++ + " ");


                    }
                }
                System.out.println();


            }
        }
    }
}




