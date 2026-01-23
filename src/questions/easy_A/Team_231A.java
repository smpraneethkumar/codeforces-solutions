package questions.easy_A;

import java.util.Scanner;

public class Team_231A {

    public static  void main(String[] agrs){

        Scanner scan = new Scanner(System.in);

        int output = 0;
        int input = scan.nextInt();

        for(int i =0;i<input;i++) {
            int petya = scan.nextInt();
            int vasya = scan.nextInt();
            int tonya = scan.nextInt();
            if (petya + vasya + tonya >= 2) output++;
        }

        System.out.println(output);
    }
}
