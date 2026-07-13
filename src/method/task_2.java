package method;

import java.util.Scanner;
public class task_2 {
        public double metrgaOtgaz(double L) {
            return L / 100;
        }

        public static void main(String[] args) {

            task_2 myObj = new task_2();
            Scanner sc = new Scanner(System.in);
            System.out.print("L = ");
            double L = sc.nextDouble();
            System.out.println(myObj.metrgaOtgaz(L));
        }
    }

