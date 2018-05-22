package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P14_NumberTable {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        ;
        for (int i = 0; i < n; i++) {
            int num = 0;
            int num2 =n;
            for (int j = 0; j < n; j++) {
                if (num < n) {
                    num = i + j + 1;
                    System.out.print(num+" ");

                } else {

                    System.out.print(--num2+" ");
                }
            }
            System.out.println();
        }

    }
}

