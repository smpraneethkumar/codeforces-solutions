package questions.march;

import java.util.*;

public class IQTest_25A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0, oddCount = 0;

        // Count first 3 elements to determine majority
        for (int i = 0; i < 3; i++) {
            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        // If majority are even → find odd
        if (evenCount > oddCount) {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } 
        // If majority are odd → find even
        else {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}