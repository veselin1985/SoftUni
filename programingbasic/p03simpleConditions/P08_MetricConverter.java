package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P08_MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double number = Double.parseDouble(console.nextLine());
        String inputMetric = console.nextLine();
        String outputMetric = console.nextLine();

        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;

        if (inputMetric.equals("mm")){number = number/mm;}
       else if(inputMetric.equals("cm")){number = number/cm;}
       else if(inputMetric.equals("mi")){number = number/mi;}
       else if(inputMetric.equals("in")){number = number/in;}
       else if(inputMetric.equals("km")){number = number/km;}
       else if(inputMetric.equals("ft")){number = number/ft;}
       else if(inputMetric.equals("yd")){number = number/yd;}

        if (outputMetric.equals("mm")){number = number*mm;}
        else if (outputMetric.equals("cm")){number = number*cm;}
        else if (outputMetric.equals("mi")){number = number*mi;}
        else if (outputMetric.equals("in")){number = number*in;}
        else if (outputMetric.equals("km")){number = number*km;}
        else if (outputMetric.equals("ft")){number = number*ft;}
        else if (outputMetric.equals("yd")){number = number*yd;}

        System.out.printf("%.8f %s", number,outputMetric);


    }
}
