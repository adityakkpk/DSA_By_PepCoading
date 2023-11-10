import java.util.Scanner;

class B_CountStarirPaths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stair height:");
        int n = sc.nextInt();
        System.out.println("Total stair paths:");
        // System.out.println(printStairPaths(n));
        // System.out.println(printStairPaths(n,new int[n+1]));
        System.out.println(printStairPaths(n));
        sc.close();
    }

    //Without DP (TC=O(3^n))
    // static int printStairPaths(int n){
    //     if(n==0) return 1;
    //     if(n<0) return 0;

    //     int nm1 = printStairPaths(n-1);
    //     int nm2 = printStairPaths(n-2);
    //     int nm3 = printStairPaths(n-3);
    //     int tp = nm1+nm2+nm3;

    //     return tp;
    // }

    
    //With Dp (TC=O(n))
    // static int printStairPaths(int n, int[] memo){
    //     if(n==0) return 1;
    //     if(n<0) return 0;
    //     if(memo[n]>0) return memo[n];

    //     int nm1 = printStairPaths(n-1, memo);
    //     int nm2 = printStairPaths(n-2, memo);
    //     int nm3 = printStairPaths(n-3, memo);
    //     int tp = nm1+nm2+nm3;

    //     memo[n]=tp;
    //     return tp;
    // }


    // without DP or Recursion
    static int printStairPaths(int n){
        int memo[] = new int[n+1];
        memo[0]=1;

        for (int i = 1; i <= n; i++) {
            if(i==1){
                memo[i]=memo[i-1];
            }else if(i==2){
                memo[i]=memo[i-1]+memo[i-2];
            }else{
                memo[i] = memo[i-1]+memo[i-2]+memo[i-3];
            }
        }
        return memo[n];
    }
}