package questions.easy_A;

import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word =  scan.next();
        int low =0;
        int up = 0;

        for(int i =0;i<word.length();i++){

            char c = word.charAt(i);

            if(c >= 97){
                low++;
            }else{
                up++;
            }
        }

        if(low >= up){
            System.out.println(word.toLowerCase());
        }else {
            System.out.println(word.toUpperCase());
        }
//        System.out.println(low +" "+up);
    }
}
