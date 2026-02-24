package questions.easy_A.feb;

import java.util.Scanner;

public class Lucky_Division_122A {



        public static void main(String [] args){



                    Scanner scan = new Scanner(System.in);
                    int num = scan.nextInt();

                    int luckyNumbers[] = {
                            4, 7,
                            44, 47, 74, 77,
                            444, 447, 474, 477,
                            744, 747, 774, 777
                    };

                    for (int lucky : luckyNumbers) {
                        if (num % lucky == 0) {
                            System.out.println("YES");
                            return;
                        }
                    }

                    System.out.println("NO");
                }
            }



