package programingbasic.p02simplecalculations;

import java.util.Scanner;

public class P01_SquareArea {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Въведете страна на квадрата a=");
        int a = Integer.parseInt(console.nextLine());
        int area = a * a;

        System.out.println("Area = " + area);
    }
}