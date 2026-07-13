package method;

import java.util.Scanner;
public class task_14 {

        public double vaqt(double s) {
            return s / 7;
        }

        public static void main(String[] args) {

            task_14 myObj = new task_14();
            Scanner sc = new Scanner(System.in);
            System.out.print("Masofani kirit: ");
            double s = sc.nextDouble();
            System.out.println(myObj.vaqt(s));
        }
    }


