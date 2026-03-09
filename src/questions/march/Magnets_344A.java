package questions.march;

import java.util.*;

public class Magnets_344A{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
//        int n = scan.nextInt();
        int n = 6;
        String[] magents  = new String[n];

        System.out.println(n);
        for(int i =0;i< n;i++){
            String s = scan.next();
            magents[i] = s;
        }


        
        int ans = 1;

        for(int i =0;i< n-1;i++){

            if(!magents[i].equals(magents[i+1])  ){
                
                ans++;
            }

        }

        System.out.println(ans);
    }
}