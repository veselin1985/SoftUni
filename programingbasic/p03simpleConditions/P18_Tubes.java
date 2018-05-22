package programingbasic.p03simpleConditions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P18_Tubes {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int volume =  Integer.parseInt(console.nextLine());
        int tube1 = Integer.parseInt(console.nextLine());
        int tube2 = Integer.parseInt(console.nextLine());
        double hours = Double.parseDouble(console.nextLine());

        double capacity = (tube1+tube2)* hours;

        if (capacity <= volume) {
            double result = (capacity/volume) *100;
            double pipe1 = ((tube1*hours)/capacity) * 100;
            double pipe2 = ((tube2*hours)/capacity) * 100;


            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.", (int)result, (int)pipe1,(int)pipe2);
        }else if (capacity >volume){
            double result = capacity - volume;

            DecimalFormat df = new DecimalFormat("0.##");

            System.out.printf("For %s hours the pool overflows with %.1f liters.", df.format(hours), result);
        }


    }
}
