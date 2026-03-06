package questions.march;

import java.util.*;

public class George_and_Accommodation_467A{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int rooms = 0;
        
        int n = scan.nextInt();
        
        for(int i =0;i<n;i++){
            
            int p = scan.nextInt();
            int q = scan.nextInt();
            
            
            if(p < q && p+1 < q){
                rooms++;
            }
        }
        
        System.out.println(rooms);
    }
}
