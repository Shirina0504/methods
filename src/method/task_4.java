package method;

import java.util.Scanner;
public class task_4 {

        public int almashtir(int son) {
            int birinchi = son / 100;
            int qolgan = son % 100;
            return qolgan * 10 + birinchi;
        }
        public static void main(String[] args) {
            task_4 myTask = new task_4();
            Scanner sc = new Scanner(System.in);
            System.out.print("3 xonali son kiriting: ");
            int son = sc.nextInt();
            System.out.println(myTask.almashtir(son));
        }
    }


