package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P05_Sequence2kPlus1 {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int num=1;
        for (int i = 1; num <=n ; i++) {
            System.out.println(num);
            num = (num*2)+1;




        }


    }
}
