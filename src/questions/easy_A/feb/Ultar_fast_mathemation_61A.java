package questions.easy_A.feb;

import java.util.Scanner;

public class Ultar_fast_mathemation_61A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input1 = scan.next();
        String input2 = scan.next();

        // String val1 = String.valueOf(input1);
        // String val2 = String.valueOf(input2);

        String ans = "";


        for(int i=0;i<input1.length();i++){

            if(input1.charAt(i) == input2.charAt(i)){
                ans+="0";
            }else{
                ans+="1";
            }
        }

        System.out.println(ans);

    }
}
