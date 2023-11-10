import java.util.Scanner;

class Fiboncci{
    
    public static void main(String... args){
        System.out.println("Enter position:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int res = FibMemoized(n, new int[n+1]);
        int res = Fib(n);
        System.out.println("Value of "+n+"th position in a Fibonacci serise is:"+res);
        sc.close();
    }

    //Solution without Dp
    private static int Fib(int n) {
        if(n==0||n==1){
            return n;
        }

        System.out.println("Hello "+n);

        int fibnm1 = Fib(n-1);
        int fibnm2 = Fib(n-2);
        int fibn = fibnm1+fibnm2;

        return fibn;
    }



    //Solution with DP (Optimal Solution) TC = O(n)
    // static int FibMemoized(int n, int[] memo){
    //     if(n==0||n==1){
    //         return n;
    //     }
    //     if(memo[n]!=0){
    //         return memo[n];
    //     }

    //     int fibnm1 = FibMemoized(n-1, memo);
    //     int fibnm2 = FibMemoized(n-2, memo);
    //     int fibn = fibnm1+fibnm2;

    //     memo[n] = fibn;

    //     return fibn;
    // }

}