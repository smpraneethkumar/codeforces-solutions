package questions.march;

import java.util.Scanner;

public class I_love_username_155A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int arr[] = new int[n];
        for(int i =0;i<n;i++){

            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int count  = 0;

        for(int i =1;i<n;i++){

            if(arr[i] > max){
                count++;
                max = arr[i];
            } else if (arr[i] < min) {
                count++;
                min = arr[i];
            }
        }

        System.out.println(count);

    }
}
