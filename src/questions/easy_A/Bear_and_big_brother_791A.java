package questions.easy_A;

import java.util.Scanner;

public class Bear_and_big_brother_791A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a  = scan.nextInt();
        int b = scan.nextInt();

        int years = 0;

        while (a<=b){

            a = a*3;
            b = b*2;
            years++;
        }
        System.out.println(years);

    }
}
