import java.util.Scanner;

public class matrixtranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrices:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] t = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

     
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                t[i][j] = matrix1[j][i];
            }
        }

        System.out.println("The Transpose of the matrices is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
