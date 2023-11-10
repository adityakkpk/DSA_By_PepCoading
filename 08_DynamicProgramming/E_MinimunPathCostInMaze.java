import java.util.Scanner;

public class E_MinimunPathCostInMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maze row and column:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter maze cost for each box:");
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();

        int[][] dp = new int[n][m];
        for (int i = dp.length-1; i >= 0; i--) {
            for (int j = dp[0].length-1; j >=0; j--) {
                
                if(i==dp.length-1 && j==dp[0].length-1){
                    dp[i][j] = arr[i][j];
                }else if( i == dp.length-1){
                    dp[i][j]= dp[i][j+1]+arr[i][j];
                }else if(j==dp[0].length-1){
                    dp[i][j] = dp[i+1][j]+arr[i][j];
                }else{
                    dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j]) + arr[i][j];
                }
            }
        }

        System.out.printf("Minimum cost to reach destination(%d,%d) is: %d.", n,m,dp[0][0]);

    }
}
