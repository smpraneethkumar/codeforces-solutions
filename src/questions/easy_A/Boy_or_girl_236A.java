package questions.easy_A;
import java.util.*;
public class Boy_or_girl_236A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String word = scan.next();

       if(boyORgirl(word) % 2 ==0){
           System.out.println("CHAT WITH HER !");
       }else {
           System.out.println("IGNORE HIM !");
       }
    }
    public static int boyORgirl(String word){

        int n = word.length();


        TreeSet<Character> tSet = new TreeSet<>();

       for(int i =0;i<n;i++){
           char c = word.charAt(i);
           tSet.add(c);


       }
       return tSet.size();


    }



}
