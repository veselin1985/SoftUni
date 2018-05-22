package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String figure = console.nextLine();
        double area = 0;

        if(figure.equals("square")) {
            double a = Double.parseDouble(console.nextLine());
            area = a * a;
            System.out.printf("%.3f", area);
            ;
        }else if (figure.equals("rectangle")) {

            double a = Double.parseDouble(console.nextLine());
            double b = Double.parseDouble(console.nextLine());
            area = a * b;
            System.out.printf("%.3f", area);
        } else if (figure.equals("circle")) {
            double a = Double.parseDouble(console.nextLine());
            area = a * a * Math.PI;
            System.out.printf("%.3f", area);
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(console.nextLine());
            double b = Double.parseDouble(console.nextLine());
            area = (a * b) / 2;
            System.out.printf("%.3f", area);
        }
    }
}

