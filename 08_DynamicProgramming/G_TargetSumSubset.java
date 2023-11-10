import java.util.Scanner;

public class G_TargetSumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        sc.close();
        boolean[][] dp = new boolean[n + 1][target+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i==0 && j==0){
                    dp[i][j] = true;
                }else if(i==0){
                    dp[i][j] = false;
                }else if(j==0){
                    dp[i][j] = true;
                }else{
                    if(dp[i-1][j]==true){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        int val = arr[i-1];
                        if(val>=j){
                            if(dp[i-1][j-val]==true){
                                dp[i][j]=true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dp[arr.length][target]);
    }
}
