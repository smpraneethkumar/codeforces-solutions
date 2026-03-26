package questions.march;

import java.util.*;

public class yes_or_yes_1703A{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i = 0;i<n;i++){
            
            String s = scan.next().toLowerCase();
            
            if(s.equals("yes")){
                
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
    }
}