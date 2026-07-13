package method;

import java.util.Scanner;

public class task_20 {

        public int belgiSoni(int kb) {
            return kb * 1024 / 2;
        }

        public static void main(String[] args) {

            task_20 myObj = new task_20();
            Scanner sc = new Scanner(System.in);
            System.out.print("KB = ");
            int kb = sc.nextInt();
            System.out.println(myObj.belgiSoni(kb));
        }
    }


