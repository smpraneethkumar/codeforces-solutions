package questions.april;

import java.util.Scanner;

public class Tram_116A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n= scan.nextInt();

               int c =0;
            int total = 0;
        for (int i=1;i<=n;i++){

            int a = scan.nextInt();
            int b= scan.nextInt();





               c = c- a + b;


              total = Math.max(total,c);



        }

        System.out.println(total);




    }
}
