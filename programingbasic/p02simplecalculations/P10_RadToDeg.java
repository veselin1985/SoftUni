package programingbasic.p02simplecalculations;

import java.util.Scanner;

public class P10_RadToDeg {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double rad = Double.parseDouble(console.nextLine());
        double deg = rad*57.2957795;
        System.out.printf("%.0f", deg);
    }
}
