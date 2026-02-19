package questions.easy_A;

import java.util.Scanner;

public class Vanya_and_Fence_677A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int persons = scan.nextInt();
        int width = scan.nextInt();
        int ans =0;
        for(int i =0;i<persons;i++){

            int person = scan.nextInt();

            if(person >width){
                ans+=2;
            }else {
                ans+=1;
            }
        }
        System.out.println(ans);
    }
}
