package programingbasic.p03simpleConditions;

import java.util.Scanner;

public class P01_ExcellentResult {
        public static void main(String[] args ){
            Scanner scanner = new Scanner(System.in);

            int NumTab = Integer.parseInt(scanner.nextLine());
            double Length = Double.parseDouble(scanner.nextLine());
            double Width = Double.parseDouble(scanner.nextLine());

            double AreaCover = NumTab*(Length+2*0.3)*(Width +2*0.3);
            double AreCare =NumTab*((Length)/2)*(Length/2);

            double USD=(AreaCover*7+AreCare*9);
            double BGN = USD*1.85;

            System.out.printf("%.2f,%s,%n",(AreaCover*7+AreCare*9),"USD");
            System.out.printf("%.2f,%s,%s",BGN,"BGN"," ");



        }
    }