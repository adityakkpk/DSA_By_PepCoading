
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println("Factors:");
        for (int div = 2; div*div <= n; div++) {
            while (n%div==0) {
                n=n/div;
                System.out.print(div+" ");
            }
        }
        if (n!=1) {
            System.out.println(n);
        }
        in.close();
    }
}
