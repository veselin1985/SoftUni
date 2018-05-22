package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P22_Scholarship {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double income = Double.parseDouble(console.nextLine());
        double result = Double.parseDouble(console.nextLine());
        double minSalary = Double.parseDouble(console.nextLine());

        double excelentSch = result * 25;
        double socialSch = minSalary * 0.35;


        if (result < 4.50) {
            System.out.println("You cannot get a scholarship!");

        } else if (income <= minSalary && result > 4.50 && result < 5.50) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialSch);

        } else if (income > minSalary && result > 4.50 && result < 5.50) {
            System.out.println("You cannot get a scholarship!");

        } else if (income > minSalary && result >= 5.50) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excelentSch));

        } else if (income > minSalary && result < 5.50) {
            System.out.println("You cannot get a scholarship!");

        } else if (income <= minSalary && result >= 5.50 && excelentSch >= socialSch) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excelentSch));

        } else if (income <= minSalary && result >= 5.50 && excelentSch < socialSch) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialSch));


        }
    }
}