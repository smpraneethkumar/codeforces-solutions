package questions.march;

import java.util.*;

public class I_Wanna_be_the_guy_469A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        boolean[] levels = new boolean[n + 1];

        int p = scan.nextInt();

        for (int i = 0; i < p; i++) {
            int x = scan.nextInt();
            levels[x] = true;
        }

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int y = scan.nextInt();
             levels[y] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!levels[i]) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }

        System.out.println("I become the guy.");
    }
}