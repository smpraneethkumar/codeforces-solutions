package questions.easy_A;

import java.util.Scanner;

public class Young_Phyiscist_69A {



        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            int lines = scan.nextInt();

            int sumX = 0;
            int sumY = 0;
            int sumZ = 0;

            for(int i =0;i< lines;i++){
                int x = scan.nextInt();
                int y = scan.nextInt();
                int z = scan.nextInt();

                sumX += x;
                sumY += y;
                sumZ += z;
            }


            if(sumX == 0 && sumY == 0 && sumZ ==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }

}
