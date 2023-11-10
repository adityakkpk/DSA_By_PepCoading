import java.util.Scanner;

public class MatrixMultipliction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Rows and Columns for 2nd matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter the elements of 2nd matrix: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        sc.close();

        //Matrix Multiplication
        if(c1 != r2){
            System.out.println("Invalid Input.");
            return;
        }

        int[][] prd = new int[r1][c2];
        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    prd[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Product of matrixes: ");
        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[i].length; j++) {
                System.out.print(prd[i][j]+" ");
            }
            System.out.println();
        }
    }
}
