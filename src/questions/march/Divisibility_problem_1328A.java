package questions.march;

import java.util.*;

public class Divisibility_problem_1328A{
    
    public static void main(String[] args){


                Scanner scan = new Scanner(System.in);

                int t = scan.nextInt();

                for(int i =0;i<t;i++){

                    int a = scan.nextInt();
                    int b = scan.nextInt();

                    int ans = (b - (a%b)) % b;

                    System.out.println(ans);
                }
            }
        }

