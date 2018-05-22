package programingbasic.p04complexconditions;

import java.util.Scanner;

public class P02_Shops {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String product = console.nextLine().toLowerCase();
        String town = console.nextLine().toLowerCase();
        double qty = Double.parseDouble(console.nextLine());

        if (town.equals("sofia")) {
            if (product.equals("coffee")) {
                System.out.println(qty * 0.5);
            } else if (product.equals("water")) {
                System.out.println(qty * 0.8);
            } else if (product.equals("beer")) {
                System.out.println(qty * 1.2);
            } else if (product.equals("sweets")) {
                System.out.println(qty * 1.45);
            } else if (product.equals("peanuts")) {
                System.out.println(qty * 1.60);
            }
        } else if (town.equals("plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(qty * 0.4);
            } else if (product.equals("water")) {
                System.out.println(qty * 0.7);
            } else if (product.equals("beer")) {
                System.out.println(qty * 1.15);
            } else if (product.equals("sweets")) {
                System.out.println(qty * 1.30);
            } else if (product.equals("peanuts")) {
                System.out.println(qty * 1.50);
            }
        } else if (town.equals("varna")) {
            if (product.equals("coffee")) {
                System.out.println(qty * 0.45);
            } else if (product.equals("water")) {
                System.out.println(qty * 0.7);
            } else if (product.equals("beer")) {
                System.out.println(qty * 1.10);
            } else if (product.equals("sweets")) {
                System.out.println(qty * 1.35);
            } else if (product.equals("peanuts")) {
                System.out.println(qty * 1.55);
            }
        }
    }
}