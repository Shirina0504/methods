package method;

import java.util.Scanner;

public class task_16 {

        public double vaqt(double gb) {
            double kb = gb * 1024 * 1024;
            return kb / 750;
        }

        public static void main(String[] args) {

            task_16 myObj = new task_16();
            Scanner sc = new Scanner(System.in);
            System.out.print("GB = ");
            double gb = sc.nextDouble();
        }
    }


