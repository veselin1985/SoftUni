package programingbasic.p04complexconditions;

import java.util.Scanner;

public class P13_PointInFigure {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int h = Integer.parseInt(console.nextLine());
        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());

        if (((x > 0 && x < 3 * h) && (y > 0 && y < h)) || ((x > h && x < 2 * h) && (y > h && y < 4 * h)) || ((y == h && (x > h && x < 2 * h))) || (x>h && x<2*h && y==h)) {
            System.out.println("inside");

        } else if ((y == 0 && x>=0 && x <= 3 * h) || (y == h && x >= 0 && x <= h) || (y == h && x >= 2 * h && x <= 3 * h) || (y == 4 * h && x >= h && x <= 2 * h) || (x == h && y >= h && y <= 4 * h) || (x == 2 * h && y >= 2*h && y <= 4 * h) || (x==0 && y<=h)|| (x==3*h && y>=0 && y<=h))

        { System.out.println("border");
        } else {
            System.out.println("outside");
        }
    }
}