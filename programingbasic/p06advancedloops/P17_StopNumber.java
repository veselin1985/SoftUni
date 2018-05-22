package programingbasic.p06advancedloops;

import java.util.Scanner;

public class P17_StopNumber {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int start = Integer.parseInt(console.nextLine());
        int finish = Integer.parseInt(console.nextLine());
        int stop = Integer.parseInt(console.nextLine());


        while (finish >= start)
            if (finish % 2 == 0 && finish % 3 == 0)
                if (finish == stop) {
                    break;
                } else {
                    System.out.print(finish + " ");
                    finish--;
                }
            else {
                finish--;
            }
    }
}
