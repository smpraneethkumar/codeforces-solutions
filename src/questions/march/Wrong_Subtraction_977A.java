package questions.march;

import java.util.Scanner;

public class Wrong_Subtraction_977A {




        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int  k = scan.nextInt();

            for(int i =0;i<k;i++){

                if(n%10==0){
                    n = n/10;
                }else{
                    n = n-1;
                }
            }

            System.out.println(n);
        }
    }

