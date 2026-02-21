package questions.easy_A;
import java.util.*;
public class Chart_room_58A {





        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            String s = scan.next();

            String correct = "hello";
            int a = 0;

            // for(int i =0;i<s.length();i++){
            int  i =0;
            while(i<s.length()){

                if(s.charAt(i) == correct.charAt(a)){

                    a++;

                    if(a == correct.length()){
                        System.out.println("YES");

                        return;
                    }
                }

                i++;
            }

            System.out.println("NO");
        }

}
