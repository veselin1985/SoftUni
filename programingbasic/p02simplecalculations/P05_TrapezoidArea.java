package programingbasic.p02simplecalculations;

import java.util.Scanner;

public class P05_TrapezoidArea {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double b1 = Double.parseDouble(console.nextLine());
        double b2 = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        double area = (b1+b2) * h/2;
        System.out.println("Trapezoid Area = " + area);
    }
}
