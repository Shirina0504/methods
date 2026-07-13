package method;

import java.util.Scanner;
public class task_17 {

        public double soat(int sekund) {
            return sekund / 3600;
        }

        public static void main(String[] args) {

            task_17 myObj = new task_17();
            Scanner sc = new Scanner(System.in);
            System.out.print("Sekundni kirit: ");
            int sekund = sc.nextInt();
            System.out.println(myObj.soat(sekund));
        }
    }


