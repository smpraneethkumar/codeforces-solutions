package questions.easy_A;

        import java.util.*;
public class Theatre_square_1A {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();

        int length = (n + a - 1) / a;
        int width = (m + a - 1) / a;

        int result = length * width;

        System.out.println(result);

    }

}
