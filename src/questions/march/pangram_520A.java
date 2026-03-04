package questions.march;

import java.util.*;

public class pangram_520A{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        String s = scan.next();
      
      s= s.toLowerCase();
      HashSet<Character> hs = new HashSet<>();
      
      for(int i =0;i<n;i++){
          
          hs.add(s.charAt(i));
      }
      
      if(hs.size() == 26){
          System.out.println("YES");
      }else{
          System.out.println("NO");
      }
      
            
              
      
        
    }
    
}