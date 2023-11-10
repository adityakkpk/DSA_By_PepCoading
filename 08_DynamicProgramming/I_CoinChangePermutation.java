import java.util.Scanner;

public class I_CoinChangePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coin counts:");
        int n = sc.nextInt();

        System.out.println("Enter dp:");
        int[] coins = new int[n];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.println("Enter amount to pay:");
        int tar = sc.nextInt();
        sc.close();

        int[] dp = new int[tar+1];
        dp[0]=1;

        for (int amt = 1; amt <= tar; amt++) {
            for (int coin : coins) {
                if (coin<=amt) {
                    int ramt = amt-coin;
                    dp[amt] = dp[amt]+dp[ramt];
                }
            }
        }

        System.out.printf("All permutations of amount %d in %d ways.", tar, dp[tar]);

    }
}

