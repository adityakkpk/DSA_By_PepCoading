
import java.util.Scanner;

public class PermutationFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        int nf = factorial(n);
        int nmrf = factorial(n-r);
        int npr= nf/nmrf;
        display(n, r, npr);
        sc.close();
    }
    public static int factorial(int x){
        int nf =1;
        for (int i = 1; i <=x; i++) {
            nf *=i;
        }
        return nf;
    }
    public static void display(int a, int b, int c){
        System.out.printf("Permutation(%dP%d)= %d", a, b, c);
    }
    
}
