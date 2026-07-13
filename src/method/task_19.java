package method;

import java.util.Scanner;

public class task_19 {

        public double uzunlik(double r) {
            return 2 * 3.14 * r;
        }

        public static void main(String[] args) {

            task_19 myTask = new task_19();
            Scanner sc = new Scanner(System.in);
            System.out.print("R = ");
            double r = sc.nextDouble();
            System.out.println(myTask.uzunlik(r));
        }
    }

