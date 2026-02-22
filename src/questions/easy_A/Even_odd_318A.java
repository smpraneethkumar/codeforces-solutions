package questions.easy_A;

import java.util.Scanner;

public class Even_odd_318A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();
        long k = scan.nextLong();

        long oddCount = (n + 1) / 2;

        if (k <= oddCount) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - oddCount));
        }
    }
}
