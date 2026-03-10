package questions.march;

import java.util.*;

public class Hit_the_Lottery_996A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int count = 0;


        count += n / 100;
        n = n % 100;

        count += n / 20;
        n = n % 20;

        count += n / 10;
        n = n % 10;

        count += n / 5;
        n = n % 5;

        count += n;

        System.out.println(count);
    }
}