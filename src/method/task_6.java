package method;

import java.util.Scanner;
public class task_6 {

        public int almashtir(int son) {
            int yuz = son / 100;
            int on = (son % 100) / 10;
            int bir = son % 10;
            return bir * 100 + on * 10 + yuz;
        }

        public static void main(String[] args) {

            method.task_6 myTask = new task_6();
            Scanner sc = new Scanner(System.in);
            System.out.print("3 xonali son kirit: ");
            int son = sc.nextInt();
            System.out.println(myTask.almashtir(son));
        }
    }


