package questions.april;

import java.util.*;

public class Arrival_of_the_general_144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int max = -1, min = 101;
        int maxIndex = 0, minIndex = 0;
        
        // Find max (first occurrence) and min (last occurrence)
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] <= min) {
                min = a[i];
                minIndex = i;
            }
        }
        
        int moves = maxIndex + (n - 1 - minIndex);
        
        if (maxIndex > minIndex) {
            moves--; // overlap case
        }
        
        System.out.println(moves);
    }
}