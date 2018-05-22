package programingbasic.p04complexconditions;

import java.util.Scanner;

public class P10_AnimalType {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String animal = console.nextLine().toLowerCase();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "tortoise":
            case "snake":
            case "crocodile":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;

        }
    }
}
