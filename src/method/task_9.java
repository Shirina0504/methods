package method;

import java.util.Scanner;
public class task_9 {

        public void vaqt(int n) {
            int soat = n / 3600;
            int minut = (n % 3600) / 60;
            System.out.println(soat + " soat");
            System.out.println(minut + " minut");
        }

        public static void main(String[] args) {

            task_9 myObj = new task_9();
            Scanner sc = new Scanner(System.in);
            System.out.print("Sekundni kirit: ");
            int n = sc.nextInt();

            myObj.vaqt(n);
        }
    }

