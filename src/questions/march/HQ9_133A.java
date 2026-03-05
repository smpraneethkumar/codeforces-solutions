package questions.march;

import java.util.*;

public class HQ9_133A{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String p = scan.next();
        
        for(int i =0;i<p.length();i++){
            
            char c= p.charAt(i);
            
            if(c == 'H' || c == 'Q' || c == '9'){
                
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
    }
}