package programingbasic.p06advancedloops;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class P24_TrainerSalary {


        public static void main(String[] args) {

            Scanner console = new Scanner(System.in);

            int n = Integer.parseInt(console.nextLine());
            double budget = Double.parseDouble(console.nextLine());

            int Roli = 0;
            int Trofon = 0;
            int Sino = 0;
            int Jelev = 0;
            int RoYaL = 0;
            int Others = 0;

            double sumPerLecture = budget/n*1.0;

            for (int i = 0; i < n; i++) {
                String trainer = console.nextLine();

                switch (trainer) {
                    case "Roli":
                        Roli++;
                        break;
                    case "RoYaL":
                        RoYaL++;
                        break;
                    case "Trofon":
                        Trofon++;
                        break;
                    case "Sino":
                        Sino++;
                        break;
                    case "Jelev":
                        Jelev++;
                        break;
                    default:
                        Others++;
                        break;


                }




            }  System.out.printf("Jelev salary: %.2f lv%n",(Jelev*sumPerLecture));
            System.out.printf("RoYaL salary: %.2f lv%n", (RoYaL*sumPerLecture));
            System.out.printf("Roli salary: %.2f lv%n",(Roli*sumPerLecture));
            System.out.printf("Trofon salary: %.2f lv%n",(Trofon*sumPerLecture));
            System.out.printf("Sino salary: %.2f lv%n",(Sino*sumPerLecture));
            System.out.printf("Others salary: %.2f lv%n",(Others*sumPerLecture));
        }
    }
