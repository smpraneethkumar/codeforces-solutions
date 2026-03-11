package questions.march;

import java.util.*;

public class Anton_and_polyhedorons_785A{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int total =0;
        
         for(int i =0;i<n;i++){
        
        String s = scan.next().toLowerCase();
        
        if(s.equals("tetrahedron")){
            total += 4;
        }
        if (s.equals("cube")) {
            total += 6;
            
        }
        if (s.equals("octahedron")) {
            total += 8;
        }
        if (s.equals("dodecahedron")){
            total += 12;
        }
        if(s.equals("icosahedron")) {
            total += 20;
        }
         }

        System.out.println(total);
    }
}