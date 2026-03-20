package questions.march;

import java.util.*;

public class Sum_1742A{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // test cases
        int t = scan.nextInt();

        // a b c
//
        int i = 0;
        while (i<t){

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if(a +b ==c || b +c ==a || a + c == b){
                System.out.println("YES");

            }else{
                System.out.println("NO");
            }


            i++;
        }


    }
}