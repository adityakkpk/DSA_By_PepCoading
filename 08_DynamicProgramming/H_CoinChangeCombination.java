import java.util.Scanner;

public class H_CoinChangeCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coin counts:");
        int n = sc.nextInt();

        System.out.println("Enter coins:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter amount to pay:");
        int amt = sc.nextInt();
        sc.close();

        int[] dp = new int[amt+1];
        dp[0]=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                dp[j]+=dp[j-arr[i]];
            }
        }

        System.out.printf("You can pay amount %d in %d ways.", amt, dp[amt]);

    }
}
