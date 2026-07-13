package method;

import java.util.Scanner;
public class task_11 {

        public int yuzlik(int son) {

            return (son / 100) % 10;
        }
        public static void main(String[] args) {
            task_11 myObj = new task_11();
            Scanner sc = new Scanner(System.in);
            System.out.print("Son kirit: ");
            int son = sc.nextInt();
            System.out.println(myObj.yuzlik(son));
        }
    }


