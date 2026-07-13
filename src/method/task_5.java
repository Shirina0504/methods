package method;

import java.util.Scanner;
public class task_5 {

        public int teskariSon(int son) {
            int yuz = son / 100;
            int on = (son % 100) / 10;
            int bir = son % 10;
            return bir * 100 + on * 10 + yuz;
        }

        public static void main(String[] args) {

            task_5 myTask = new task_5();
            Scanner input = new Scanner(System.in);
            System.out.print("3 xonali son kirit: ");
            int son = input.nextInt();
            System.out.println(myTask.teskariSon(son));
        }
    }


