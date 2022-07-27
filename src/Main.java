import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element (" + i + "," + j + ")");
                matrix[i][j] = sc.nextInt();
                if (i == j) sum += matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-5d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Total of elements in main diagonal is " + sum);

    }
}