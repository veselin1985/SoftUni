package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P11_EnterEvenNumber {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);


        while (true) {

            String input = console.nextLine();

            try {
                int num = Integer.parseInt(input);
            } catch (Exception e) {

                System.out.println("Invalid number!");
                continue;
            }
            int num = Integer.parseInt(input);

            if (num % 2 == 1) {
                System.out.println("The number is not even.");
                continue;

            }
            if (num % 2 == 0) {
                System.out.println("Even number entered: " + num);
                break;
            }


        }


    }
}


