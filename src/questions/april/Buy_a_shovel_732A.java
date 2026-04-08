package questions.april;

import java.util.Scanner;

public class Buy_a_shovel_732A {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int r = scan.nextInt();


        for(int i =1 ;i<= 10;i++){

            int total = k *i;

            if(total %10==0 ||total %10==r){
                System.out.println(i);
                break;
            }
        }
    }
}
