import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns:");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        //Diagonal Traversal
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0, j = g; j < arr.length; i++, j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
