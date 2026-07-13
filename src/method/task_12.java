package method;

import  java.util.Scanner;
public class task_12 {

        public int minglik(int son) {
            return (son / 1000) % 10;
        }

        public static void main(String[] args) {

            task_12 myTask = new task_12();
            Scanner sc = new Scanner(System.in);
            System.out.print("Son kirit: ");
            int son = sc.nextInt();
            System.out.println(myTask.minglik(son));
        }
    }


