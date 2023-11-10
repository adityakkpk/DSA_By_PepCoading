
import java.util.Scanner;

public class SumOfSquareOfnNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        sc.close();

        // Time Complexity = O(n)
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     sum = sum+i*i;
        // }
        // System.out.println(sum);

        // Time Complexity O(1)
        int sum = (n*(n+1)*(2*n+1))/6;
        System.out.println("Sum of square of n Natural number is: "+sum);
    }
}
