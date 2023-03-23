package Video101_Matrizes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont = 0;

        System.out.printf("Enter number of arguments: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter number i(%d) e j(%d): ", i, j);
                mat[i][j] = sc.nextInt();

                if (mat[i][j] < 0) {
                    cont++;
                }
            }
        }

        System.out.printf("\n\nMain diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.printf("\nNegative numbers: %d", cont);

        sc.close();
    }

}

