package questions.easy_A;

import java.util.Scanner;

public class Next_round_158A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];

        for(int i =0;i<arr.length;i++){
            System.out.println("enter score" + i);
            int score = scan.nextInt();
            arr[i] = score;
        }

        int ans = 0;
        System.out.println("enter index");
        int index = scan.nextInt();

        for(int i=0;i<=index;i++){

            if(arr[i] < index){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
