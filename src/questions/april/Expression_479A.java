package questions.april;

import java.util.*;

public class Expression_479A{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        int max = 0;

        int ex1 =  a+ b*c;
        int ex2 = a*(b+c);
        int ex3 = a*b*c;
        int ex4 = (a+b)*c;


        int ex5 = a + b + c;

        max = Math.max(max, Math.max(ex1, ex2));
        max = Math.max(max, Math.max(ex3, ex4));
        max = Math.max(max, ex5);
        System.out.println(max);



    }
}