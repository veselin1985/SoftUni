package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P09_SumOfDigits {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());
        int sum = 0;
        while (num > 0) {

            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
