package questions.easy_A;

import java.util.Scanner;

public class Bit_282A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int howManyTimes = scan.nextInt();
        int output = 0;
        for(int i =0;i<howManyTimes;i++){
        String input = scan.next().toLowerCase();



        if(input.equals("x++") || input.equals("++x")){
            output++;
        }else {
            output--;
        }
        }

        System.out.println(output);
    }
}
