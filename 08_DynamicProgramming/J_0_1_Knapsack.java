import java.util.Scanner;

class J_0_1_Knapsack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter items count:");
        int n = sc.nextInt();
        System.out.println("Enter valuse of items:");
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        
        System.out.println("Enter weights of items:");
        int[] wts = new int[n];
        for (int i = 0; i < n; i++) {
            wts[i] = sc.nextInt();
        }

        System.out.println("Enter the capacity of bag:");
        int cap = sc.nextInt();

        int dp[][] = new int[n+1][cap+1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                
                if(j >= wts[i-1]){

                    if(dp[i-1] [ j-wts[i-1] ] + val[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][j-wts[i-1]]+val[i-1];
                    }else{
                        dp[i][j] = dp[i-1][j];//when i does not bat
                    }
                }else{
                    dp[i][j] = dp[i-1][j];//when i does not bat
                }
            }
        }
        System.out.println("Maximum weight with maximum values can be store in bag: "+ dp[n][cap]);

        sc.close();
    }
}