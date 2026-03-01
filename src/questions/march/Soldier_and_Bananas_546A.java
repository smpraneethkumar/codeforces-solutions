package questions.march;

import java.util.Scanner;

public class Soldier_and_Bananas_546A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong(); // cost of first banana
        long n = sc.nextLong(); // money he has
        long w = sc.nextLong(); // number of bananas

        long totalCost = k * w * (w + 1) / 2;
        long borrow = totalCost - n;

        if (borrow > 0) {
            System.out.println(borrow);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
