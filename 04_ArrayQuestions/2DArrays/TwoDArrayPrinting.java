import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();


        //Meth 1
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        //Meth 2
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        
        //Meth 3
        System.out.println("Array Elements:");
        System.out.println(Arrays.deepToString(arr));
    }
    
}
