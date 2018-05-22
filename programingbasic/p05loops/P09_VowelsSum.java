package programingbasic.p05loops;

import java.util.Scanner;

public class P09_VowelsSum {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String word = console.nextLine().toLowerCase();
        int sum = 0;

        for (char i = 0; i < word.length(); i++) {

            char currentChar = word.charAt(i);

            switch (currentChar) {
                case 'a':
                    sum++;
                    break;
                case 'e':
                    sum+=2;
                    break;
                case 'i':
                    sum+=3;
                    break;
                case 'o':
                    sum+=4;
                    break;
                case 'u':
                    sum+=5;
                    break;

            }

        }
        System.out.println(sum);
    }
}
