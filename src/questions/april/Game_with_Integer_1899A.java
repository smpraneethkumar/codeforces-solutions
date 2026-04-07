package questions.april;

import java.util.Scanner;

public class Game_with_Integer_1899A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();;

        while (t-- >0){

            int n = scan.nextInt();

            if(n % 3==0){
                System.out.println("Second");
            }else {
                System.out.println("First");
            }
        }


    }
}
