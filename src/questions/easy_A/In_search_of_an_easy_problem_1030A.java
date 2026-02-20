package questions.easy_A;

import java.util.Scanner;

public class In_search_of_an_easy_problem_1030A {

    public static void main(String[] args) {



                Scanner scan = new Scanner(System.in);

                int n = scan.nextInt();

                for(int i=0;i<n;i++){

                    int problem = scan.nextInt();

                    if(problem == 1){

                        System.out.println("HARD");
                        break;
                    }
                }

                System.out.println("EASY");
            }

}
