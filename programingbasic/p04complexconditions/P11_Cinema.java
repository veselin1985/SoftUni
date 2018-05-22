package programingbasic.p04complexconditions;

import java.util.Scanner;

public class P11_Cinema {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String type = console.nextLine().toLowerCase();
        int rowNubers = Integer.parseInt(console.nextLine());
        int seatNubers = Integer.parseInt(console.nextLine());

        double turnover = 0;

        if (type.equals("premiere")) {
            turnover = (rowNubers * seatNubers) * 12;

        } else if (type.equals("normal")) {
            turnover = (rowNubers * seatNubers) * 7.50;

        } else if (type.equals("discount")) {
            turnover = (rowNubers * seatNubers) * 5;
        }
        System.out.printf("%.2f leva", turnover);
    }
}
