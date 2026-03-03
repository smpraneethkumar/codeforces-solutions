package questions.march;

import java.util.Scanner;

public class Queue_at_the_School_266B {

    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);

        int n = scan.nextInt();
        int t = scan.nextInt();
        String s = scan.next().toUpperCase();

        char[] arr = s.toCharArray();

        for( int time = 0;time<t;time++){

            for(int i =0;i<n-1;i++){

                if(arr[i]== 'B' && arr[i+1] == 'G'){

                    char temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    i++;
                }
            }
        }

        System.out.println(arr);
    }
}
