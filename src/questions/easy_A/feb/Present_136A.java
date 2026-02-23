package questions.easy_A.feb;

import java.util.Scanner;

public class Present_136A {


        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int arr[] = new int[n];
            for(int i=1;i<=n;i++){

                int p = scan.nextInt();

                arr[p-i] = i;

            }

            for(int i =0;i<n;i++){

                System.out.print(arr[i]+" ");
            }
        }

}
