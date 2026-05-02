package questions.may;

import java.util.*;

public class Dragons_230A{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int s = scan.nextInt();
        int n = scan.nextInt();
        
        int[][] dragons = new int[n][2];
        
        for(int i =0;i<n;i++){
            dragons[i][0] = scan.nextInt();
            dragons[i][1] = scan.nextInt();
        }
        
        Arrays.sort(dragons, (a,b) -> a[0] - b[0]);
        
        boolean isWin = true;
        
        for(int i =0;i<n;i++){
            
            if(s> dragons[i][0]){
                s += dragons[i][1];
            }else{
                isWin = false;
                break;
            }
        }
        
        if(isWin){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}