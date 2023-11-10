
import java.util.Scanner;

public class SumOfQubeOfnNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        sc.close();

        // Time Complexity = O(n)
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     sum = sum+i*i*i;
        // }
        // System.out.println(sum);

        // Time Complexity O(1)
        int sum = (n*n*(n+1)*(n+1))/4;
        System.out.println("Sum of Qube of n Natural number is: "+sum);
    }
}
