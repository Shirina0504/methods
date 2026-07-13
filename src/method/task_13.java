package method;

import java.util.Scanner;
public class task_13 {

        public int minut(int a, int b) {
            return (a * 24 + b) * 60;
        }

        public static void main(String[] args) {

            task_13 myTask= new task_13();
            Scanner sc = new Scanner(System.in);
            System.out.print("a = ");
            int a = sc.nextInt();
            System.out.print("b = ");
            int b = sc.nextInt();
            System.out.println(myTask.minut(a, b));
        }
    }



