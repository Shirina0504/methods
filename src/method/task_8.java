package method;

import java.util.Scanner;
public class task_8 {

        public int kilobayt(int bayt) {
            return bayt / 1024;
        }
        public static void main(String[] args) {
            task_8 myTask= new task_8();
            Scanner sc = new Scanner(System.in);
            System.out.print("Baytni kirit: ");
            int bayt = sc.nextInt();
            System.out.println(myTask.kilobayt(bayt));
        }
    }


