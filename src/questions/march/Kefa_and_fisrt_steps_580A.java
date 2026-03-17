package questions.march;

import java.util.*;

public class KEfa_and_fisrt_steps{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] a =  new int[n];
        
        for(int i =0;i<n;i++){

            a[i] = scan.nextInt();

        }
        
        int maxLength = 1;
        int currentLength = 1;
        
        for(int i =1;i<n;i++){
            
            if(a[i] >= a[i-1]){
                currentLength++;
            }else{
                currentLength = 1;
            }
        maxLength = Math.max(maxLength,currentLength);
        }


        System.out.println(maxLength);
    }
}