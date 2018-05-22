package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P15_MagicNumber {

    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);

        int n = Integer.parseInt(console.nextLine());

        int number = 111111;

       while (number < 999999){

            int a = number%10;
            int b = (number /10)%10;
            int c = (number/100)%10;
            int d = (number/1000)%10;
            int e = (number/10000)%10;
            int f = (number/100000)%10;

            if (a*b*c*d*e*f == n){
                System.out.print(number+" ");
                number++;
            }else {
                number++;
            }

            }

        }
    }

