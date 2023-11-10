import java.util.Scanner;

public class RotateBy90deg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();

        rotate(arr);
        System.out.println("90 Degree Rotated Matrix: ");
        display(arr);
    }

    private static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] arr) {
        //Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse Matrix Rows
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[i].length-1;
            while(li<=ri){

                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
    }
    
}
