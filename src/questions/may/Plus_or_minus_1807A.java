package questions.may;

import java.util.*;

public class Plus_or_minus_1807A{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        
        for(int i =0;i<t;i++){
            
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            
            
            if(a + b == c){
                
                System.out.println("+");
            }else{
                System.out.println("-");
            }
        }
    }
}