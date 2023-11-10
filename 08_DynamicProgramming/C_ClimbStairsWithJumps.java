import java.util.Scanner;

class C_ClimbStairsWithJumps{

//jumps are given in a array for every stair
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Stair height:");
        int n = sc.nextInt();
        System.out.println("Enter jumps on each stair:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter jump for stair %d:",i);
            arr[i]=sc.nextInt();
        }
        sc.close();

        //with Dynamic Programming
        int[] dp = new int[n+1];
        dp[n]=1;

        for (int i = n-1; i >=0; i--) {
            for (int j = 1; j <= arr[i] && i+j < dp.length; j++) {
                dp[i] += dp[i+j];
            }
        }

        System.out.println("Total paths according to given Jumps: "+dp[0]);

    }
}