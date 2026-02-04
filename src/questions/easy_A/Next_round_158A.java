package questions.easy_A;

import java.util.Scanner;

public class Next_round_158A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int index = scan.nextInt();
        int[] arr = new int[len];

        for(int i =0;i<arr.length;i++){
            System.out.println("enter score" + i);
            int score = scan.nextInt();
            arr[i] = score;
        }

        int ans = 0;
      int qrr = arr[index-1];


        for(int i=0;i<len;i++){

            if(arr[i] >= qrr && arr[i] > 0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
