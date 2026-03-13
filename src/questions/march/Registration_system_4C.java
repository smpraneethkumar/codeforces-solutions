package questions.march;

import java.util.*;

public class Registration_system_4C{
    
    public static void main(String[] args){
        
        Scanner scan =  new Scanner(System.in);
        
        int n = scan.nextInt();
        
      
        
        HashMap<String,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            
            String s = scan.next();
            
            if(!map.containsKey(s)){
                
                map.put(s,1);
                System.out.println("OK");
            }else{
                int count = map.get(s);
                System.out.println(s+count);
                map.put(s,count+1);
             
                
            }
            
        }
    }
}