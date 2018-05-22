package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P07_CGD {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        int num1=Math.max(a,b);
        int num2=Math.min(a,b);


        while (num2!=0){
            int oldNum2 = num2;

            num2= num1% num2;
            num1=oldNum2;
        }
        System.out.println(num1);

    }
}
