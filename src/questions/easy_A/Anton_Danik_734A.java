package questions.easy_A;

import java.util.Scanner;

public class Anton_Danik_734A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalGames = scan.nextInt();
        String score = scan.next();

        int anton =0;
        int danik =0;
        for(int i =0;i<totalGames;i++){
            char c = score.charAt(i);
            if(c == 'A'){
                anton++;
            }else{
                danik++;
            }
        }

        if(anton > danik){
            System.out.println("Anton");
        }else if(danik > anton){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
