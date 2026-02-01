package questions.easy_A;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths_339A {

    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);
String  sum = "";
        String input = scan.next();

       String[] n =  input.split(",");

       Arrays.sort(n);

        System.out.println(Arrays.toString(n));

        String s = "3+2+1";
        String[] arr = s.split(" ");
        for (String str : arr) {
            System.out.println(str);
        }



        for(int i =0;i<input.length();i++){

            char firstsNum = input.charAt(i);




//            switch (firstsNum){
//
//                case '1' : sum+= '1';
//                continue;
//                case '2': sum+= '2';
//                continue;
//                case '3' : sum+= '3';
//                continue;
//                default:sum+= '+';
//            }
//           if (firstsNum == '1'){
//               sum += "1+";
//
//           } else if (firstsNum == '2') {
//               sum+= "2+";
//
//           }else if (firstsNum == '3'){
//               sum += "3+";
//
//           }
        }
        System.out.println(sum);
    }
}
