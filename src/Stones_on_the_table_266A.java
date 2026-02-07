import java.util.Scanner;

public class Stones_on_the_table_266A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String str = scan.next().toUpperCase();
        int ans = 0;

        // String str = "";
        // for(int  i =0;i<num;i++){
        // }

        for(int i =0;i<num-1;i++){

            char c = str.charAt(i);
            char n = str.charAt(i+1);
            if(c == n){
                ans++;

            }

        }

        System.out.println(ans);
    }
}
