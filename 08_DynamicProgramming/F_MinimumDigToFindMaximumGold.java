import java.util.Scanner;

class F_MinimumDigToFindMaximumGold{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and columns:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter maze elements: ");
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        //approach
        int[][] dp = new int[n][m];

        for(int col=dp[0].length-1; col>=0 ;col--){
            for (int row = dp.length-1; row>=0; row--) {
                
                if(col==arr[0].length-1){
                    dp[row][col] = arr[row][col];
                }else if(row==0){
                    dp[row][col]= Math.max(dp[row][col+1], dp[row+1][col+1])+arr[row][col];
                }else if(row==arr.length-1){
                    dp[row][col]= Math.max(dp[row][col+1], dp[row-1][col+1])+arr[row][col];
                }else{
                    dp[row][col]= Math.max(dp[row][col+1], Math.max(dp[row+1][col+1], dp[row-1][col+1]))+arr[row][col];
                }

            }
        }

        int max = dp[0][0];
        for (int i = 0; i < dp[0].length; i++) {
            if(dp[i][0]>max){
                max=dp[i][0];
            }
        }

        System.out.println("Maximum gold found: "+ max);
    }
}