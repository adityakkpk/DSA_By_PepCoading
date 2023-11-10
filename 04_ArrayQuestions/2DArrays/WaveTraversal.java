import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();

        //Wave Traversal
        for(int j = 0; j<arr[0].length; j++){
            if (j%2==0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j]+ " ");
                }
            }else{
                for (int i = arr.length-1; i >=0 ; i--) {
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
}
