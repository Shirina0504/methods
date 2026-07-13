package method;

import java.util.Scanner;
public class task_3 {

        public int yuzlarXonasi(int son) {
            return son / 100;
        }
        public static void main(String[] args) {
            task_3 myTask = new task_3();
            Scanner sc = new Scanner(System.in);
            System.out.print("3 xonali son kirit: ");
            int son = sc.nextInt();
            System.out.println(myTask.yuzlarXonasi(son));
        }
    }

