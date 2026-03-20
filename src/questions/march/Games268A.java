package questions.march;

import java.util.*;

public class Games268A{
    
    public static void main(String[] args){

int aa = 5+6;
int b = aa-6   ;
        System.out.println(b);
        
        Scanner scan = new Scanner(System.in);
        
        int n= scan.nextInt();
        
        int[] h = new int[n];
        int[] a = new int[n];
        int count = 0;
        
        for(int i =0;i<n;i++){
            
            h[i] = scan.nextInt();
            a[i]= scan.nextInt();
        }
        
        for(int i =0;i<n;i++){
            
            for(int j =0;j<n;j++){
                
                if(i != j && a[i] == h[j]){
                    
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
    }
}