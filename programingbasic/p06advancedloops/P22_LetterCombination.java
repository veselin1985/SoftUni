package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P22_LetterCombination {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        char start = console.next().charAt(0);
        char finish = console.next().charAt(0);
        char skipChar = console.next().charAt(0);

        int counter = 0;


        for(int i = start; i <= finish; i++) {
            for (int j = start; j <= finish; j++) {
                for (int k = start; k <= finish; k++) {

                    if (k != skipChar && i != skipChar && j != skipChar) {

                        System.out.print(Character.toChars(i));
                        System.out.print(Character.toChars(j));
                        System.out.print(Character.toChars(k));
                        System.out.print(" ");
                        counter++;


                    }

                }


            }

        }System.out.print(counter);
    }
}
