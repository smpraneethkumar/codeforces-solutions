package questions.march;

import java.util.Scanner;

public class Soft_drinking_151A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int p = scan.nextInt();
        int nl = scan.nextInt();
        int np = scan.nextInt();

        int drinks =  k * l / nl;
        int a = c*d;
        int toastsSalt = p/np;


        int ans = Math.min(drinks,Math.min(a,toastsSalt));




        System.out.println(ans/n);
    }
}
