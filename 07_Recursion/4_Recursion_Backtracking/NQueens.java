import java.util.Scanner;

class NQueens{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter chess board size:");
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        printNQ(chess,"",0);
        sc.close();
    }
    public static void printNQ(int[][] chess,String ans,int row){
        if(row==chess.length){
            System.out.println(ans);
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if(isQueenSafe(chess,row,col)==true){
                chess[row][col]=1;
                printNQ(chess,ans+row+"-"+col+",",row+1);
                chess[row][col]=0;
            }
        }
    }
    private static boolean isQueenSafe(int[][] chess, int row, int col) {

        for (int i = row-1, j=col; i >=0; i--) {
            if(chess[i][j]==1){
                return false;
            }
        }
        for (int i = row-1, j=col-1; i >=0&&j>=0; i--,j--) {
            if(chess[i][j]==1){
                return false;
            }
        }
        for (int i = row-1, j=col+1; i >=0 && j<chess.length; i--,j++) {
            if(chess[i][j]==1){
                return false;
            }
        }

        return true;
    }
}