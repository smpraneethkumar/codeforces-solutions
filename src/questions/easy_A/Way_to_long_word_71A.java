package questions.easy_A;

import java.util.Scanner;

public class Way_to_long_word_71A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String words = sc.next();
            int n = words.length();

            if (n > 10) {
                char start = words.charAt(0);
                char end = words.charAt(n-1);

                System.out.println(start+""+(n-2)+""+end);
            } else {
                System.out.println(words);
            }
        }
    }


    }

