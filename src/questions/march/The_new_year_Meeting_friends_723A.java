package questions.march;

import java.util.*;
 
public class The_new_year_Meeting_friends_723A{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        

        int[] arr = new int[3];

        for(int i =0;i<3;i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int median = arr[1];

        int distance = Math.abs(arr[0] - median)+ Math.abs(arr[1] - median) + Math.abs(arr[2] - median);
        
        
        System.out.println(distance);
        
    }
}