package questions.easy_A;

import java.sql.SQLOutput;
import java.util.*;

public class Beautiful_matrix_263A {

    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[5][5];

        int oneRow = 0;
        int oneCol = 0;

        // Read input
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                matrix[i][j] = scan.nextInt();

                // Find position of 1
                if (matrix[i][j] == 1) {
                    oneRow = i;
                    oneCol = j;
                }
            }
        }

        // Calculate moves
        int moves = Math.abs(oneRow - 2) + Math.abs(oneCol - 2);

        System.out.println(moves);

    }
}
