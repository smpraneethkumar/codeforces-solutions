package questions.march;

import java.util.*;

public class Amusing_joke_141A{
    
    public static void main(String[] args){





        
        Scanner scan = new Scanner(System.in);
        
        String guest = scan.next();
        String host  = scan.next();
        String pile = scan.next();


        // If lengths don't match, impossible
        if (guest.length() + host.length() != pile.length()) {
            System.out.println("NO");
            return;
        }

        int[] freq = new int[26];

        // Count guest + host
        for (char c : guest.toCharArray()) {
            freq[c - 'A']++;

        }
        for (char c : host.toCharArray()) {
            freq[c - 'A']++;
        }

        // Subtract pile
        for (char c : pile.toCharArray()) {
            freq[c - 'A']--;
        }

        // Check if all zero
        for (int i : freq) {
            System.out.println(i);
            if (i != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

        
        
//        if(guest.length() + residence.length() == pile.length()){
//
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
    }

}