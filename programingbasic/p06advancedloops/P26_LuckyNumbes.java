package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P26_LuckyNumbes {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        int number = 1111;

        while (number < 10000) {

            int d = number%10;
            int c = (number /10)%10;
            int b = (number/100)%10;
            int a = number/1000;

            if((a+b==c+d) && (num%(a+b)==0)&&a!=0&&b!=0&&c!=0&&d!=0){
                System.out.print(number+" ");
            }number++;
        }
    }
}
