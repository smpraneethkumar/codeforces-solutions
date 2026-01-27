package questions.easy_A;

import java.util.Scanner;

public class Petya_and_Strings_112A {

//    public static void check (String input1,String input2){
//        char c1 = input1.charAt(0);
//        char c2 = input2.charAt(0);
//
//        if(c1 <c2){
//            System.out.println(-1);
//        } else if (c2 < c1) {
//            System.out.println(1);
//        }else {
//            System.out.println(0);
//        }
//    }

    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);

        String input1 = scan.next().toLowerCase();
        String input2 = scan.next().toLowerCase();

        int n = input2.length();
        int total1 =0;
        int total2 = 0;
        for(int i =0;i<n;i++) {

            char c1 = input1.charAt(i);
            char c2 = input2.charAt(i);


            if (c1 > c2) {
                System.out.println(1);
                return;
            } else if (c1 < c2) {
                System.out.println(-1);
                return;
            }

        }
            System.out.println(0);


    }
}
