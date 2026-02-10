package questions.easy_A;

        import java.util.*;
public class Football_96A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
                if (count == 7) {
                    System.out.println("YES");
                    return;
                }
            } else {
                count = 1;
            }
        }

        System.out.println("NO");

    }

}
