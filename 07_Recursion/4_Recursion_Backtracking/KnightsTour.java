import java.util.Arrays;
import java.util.Scanner;

public class KnightsTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter chess board size:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] chess = new int[n][m];
        System.out.println("Enter Knights indexes:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        printKT(chess,r,c,0);
        sc.close();
    }

    private static void printKT(int[][] chess, int row, int col, int move) {
        if(row <0||col<0||row>=chess.length||col>=chess.length||chess[row][col]>0){
            return;
        }else if(move==chess.length*chess.length){
            chess[row][col]=move;
            System.out.println("Array:");
            System.out.println(Arrays.deepToString(chess));
            chess[row][col]=0;
            return;
        }

        chess[row][col]=move;
        printKT(chess, row-2, col+1, move+1);
        printKT(chess, row-1, col+2, move+1);
        printKT(chess, row+1, col+2, move+1);
        printKT(chess, row+2, col+1, move+1);
        printKT(chess, row+2, col-1, move+1);
        printKT(chess, row+1, col-2, move+1);
        printKT(chess, row-1, col+2, move+1);
        printKT(chess, row-2, col+1, move+1);
        chess[row][col]=0;
    }
    
}
