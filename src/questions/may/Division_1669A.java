package questions.may;

import java.util.*;

public class Division_1669A{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        
        int   t = scan.nextInt();
        
        for(int i =0;i<t;i++){
            
            int rating = scan.nextInt();
            
            if(rating >= 1900 ){
                System.out.println("Division 1");

            } else if (rating  >= 1600 && rating <= 1899) {
                System.out.println("Division 2");

            }else if (rating  >= 1400 && rating <= 1599) {
                System.out.println("Division 3");

            }else {
                System.out.println("Division 4");
            }
        }
    }
}