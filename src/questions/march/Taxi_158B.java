package questions.march;

import java.util.*;

public class Taxi_158B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 1) count1++;
            else if (x == 2) count2++;
            else if (x == 3) count3++;
            else count4++;
        }

        int taxis = 0;

        // groups of 4
        taxis += count4;

        // pair 3 with 1
        taxis += count3;
        count1 = Math.max(0, count1 - count3);

        // pair 2 with 2
        taxis += count2 / 2;
        count2 %= 2;

        // if one 2 left
        if (count2 == 1) {
            taxis += 1;
            count1 = Math.max(0, count1 - 2);
        }

        // remaining 1's
        taxis += (count1 + 3) / 4;

        System.out.println(taxis);
    }
}