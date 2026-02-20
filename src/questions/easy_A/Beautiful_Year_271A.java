package questions.easy_A;

import java.util.Scanner;

public class Beautiful_Year_271A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        while (true) {
            year++;
            String y = String.valueOf(year);

            if (y.charAt(0) != y.charAt(1) &&
                y.charAt(0) != y.charAt(2) &&
                y.charAt(0) != y.charAt(3) &&
                y.charAt(1) != y.charAt(2) &&
                y.charAt(1) != y.charAt(3) &&
                y.charAt(2) != y.charAt(3)) {

                System.out.println(year);
                break;
            }
        }
    }
}