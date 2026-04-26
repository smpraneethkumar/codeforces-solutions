package questions.april;

import java.util.*;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean convert = true;

        // Check condition
        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                convert = false;
                break;
            }
        }

        if (convert) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isLowerCase(ch)) {
                    result.append(Character.toUpperCase(ch));
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            }

            System.out.println(result);
        } else {
            System.out.println(s);
        }
    }
}