package array;
import java.util.Scanner;


public class RemoDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Input dimensions of the matrices
        System.out.println("Enter the number of rows and columns of the first matrix: ");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();
        System.out.println("Enter the number of rows and columns of the second matrix: ");
        int rows2 = scanner.nextInt();
        int columns2 = scanner.nextInt();

        // Check if matrices can be multiplied
        if (columns1 != rows2) {
            System.out.println("Matrices cannot be multiplied. Column count of the first matrix must match row count of the second matrix.");
            return;
        }

        // Create matrices
        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];

        // Input elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform multiplication
        int[][] product = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result
        System.out.println("The result of matrix multiplication is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }


	}


