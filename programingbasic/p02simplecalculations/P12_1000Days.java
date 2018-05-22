package programingbasic.p02simplecalculations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P12_1000Days {

    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String text = console.nextLine();
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        LocalDate after1000Days = parsedDate.plusDays(999);
        System.out.printf("%1$td-%1$tm-%1$tY", after1000Days);
    }
}
