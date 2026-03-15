package questions.march;

import java.util.*;

public class Dubstep_208A{
    
    public static void main(String[] args){


//        Shortest Java solution
//        import java.util.*;
//
//        public class Dubstep_208A{
//            public static void main(String[] args){
//                Scanner scan = new Scanner(System.in);
//                String s = scan.next();
//                System.out.println(s.replaceAll("(WUB)+", " ").trim());
//            }
//        }
        
        Scanner scan = new Scanner(System.in);
        
        String  s = scan.nextLine();
        
        int i =0;
        while(i<s.length()){
            
            if( i+2 < s.length() &&s.charAt(i)== 'W' && s.charAt(i+1)== 'U' && s.charAt(i+2)== 'B'){
                
                i+=3;
                System.out.print(" ");
            }else{
                System.out.print(s.charAt(i));
                i++;
            }
            
            
        }
    }
}