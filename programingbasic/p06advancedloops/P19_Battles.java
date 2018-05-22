package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P19_Battles {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int pockemon1 = Integer.parseInt(console.nextLine());
        int pockemon2 = Integer.parseInt(console.nextLine());
        int battles = Integer.parseInt(console.nextLine());

        int counter = 1;

        for (int i = 1; i <= pockemon1; i++) {
            for (int j = 1; j <= pockemon2; j++) {
                if (counter > battles) {
                    break;

                } else {
                    System.out.printf("(%d <-> %d) ", i, j);
                    counter++;


                }

            }

        }
    }
}
