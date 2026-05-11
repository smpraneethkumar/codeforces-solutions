package questions.may;

import java.util.*;

public class Lucky_1676A{
    
    public static void main(String [] args){
        
        Scanner scan= new Scanner(System.in);
        
        
        int t = scan.nextInt();

        for(int i =0;i<t;i++){
        int fisrtSet = 0;
        int secondSet = 0;

            String digits = scan.next();
            
            
            for(int j = 0;j<digits.length();j++){
                
                if(j < 3){


                fisrtSet += digits.charAt(j) - '0';
                }else{



                    secondSet += digits.charAt(j) - '0';
                }
                
                
            }
            
            if(fisrtSet == secondSet){
                
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}