package questions.easy_A;
import java.util.*;
public class Nearly_luckly_number_110A {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String number = scan.next();
        int count =0;
        for(int i =0;i<number.length();i++){

            if(number.charAt(i) =='4' || number.charAt(i) == '7'){
                count++;
            }
        }

        String check = String.valueOf(count);
        System.out.println(check);

        boolean isLucky = true;

        for(int i =0;i<check.length();i++){

            if(check.charAt(i) != '4' && check.charAt(i) != '7'){
                isLucky = false;
                break;
            }
        }

        if(isLucky && count > 0){

            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
