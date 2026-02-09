package questions.easy_A;

        import java.util.*;
public class Football_96A {

    public static void main(String[] args) {




                Scanner scan = new Scanner(System.in);


                String input = scan.next();
                int count = 0;

                for(int i =0;i<input.length();i++){

                    char c = input.charAt(i);
                    char d = input.charAt(i+1);
                    if(c =='0' &&  d =='0'){
                        count++;
                    }
                }

                if(count >= 7){

                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }



        }

}
