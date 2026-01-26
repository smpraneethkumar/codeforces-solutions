package questions.easy_A;
import java.util.*;
public class Word_Capitalization_281A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

           char first = Character.toUpperCase(word.charAt(0));

           String rest = word.substring(1);

        System.out.println(first+rest);

//        System.out.println(v);
    }
}
