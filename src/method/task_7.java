package method;

import java.util.Scanner;
public class task_7 {

        public int yigindi(int son) {
            int yuz = son / 100;
            int on = (son % 100) / 10;
            int bir = son % 10;
            return yuz + on + bir;
        }
        public static void main(String[] args) {
            task_7 myTask = new task_7();
            Scanner sc = new Scanner(System.in);
            System.out.print("3 xonali son kirit: ");
            int son = sc.nextInt();
            System.out.println(myTask.yigindi(son));
        }
    }

