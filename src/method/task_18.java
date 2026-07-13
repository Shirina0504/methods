package method;

import java.util.Scanner;

public class task_18 {

        public void vaqt(int n) {
            int kun = n / 86400;
            int qoldiq = n % 86400;
            int soat = qoldiq / 3600;
            qoldiq = qoldiq % 3600;
            int minut = qoldiq / 60;
            int sekund = qoldiq % 60;
            System.out.println(kun + " kun");
            System.out.println(soat + " soat");
            System.out.println(minut + " minut");
            System.out.println(sekund + " sekund");
        }

        public static void main(String[] args) {

            task_18 myObj = new task_18();
            Scanner sc = new Scanner(System.in);
            System.out.print("N = ");
            int n = sc.nextInt();
            myObj.vaqt(n);
        }
    }


