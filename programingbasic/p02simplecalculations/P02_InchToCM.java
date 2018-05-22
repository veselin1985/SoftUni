package programingbasic.p02simplecalculations;

import java.util.Scanner;

public class P02_InchToCM {

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("inches: ");
        double inches = Double.parseDouble (console.nextLine());
        double centimaters = inches * 2.54;
        System.out.println("centimaters = " + centimaters);


    }
}
