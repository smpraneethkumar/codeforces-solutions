package questions.april;

import java.util.Scanner;

public class Drink_200B {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            double sum = 0;
            for(int i =0;i<n;i++){

                sum+= scan.nextInt();
            }

            double result = sum /n;

        System.out.println(result);
    }
}
