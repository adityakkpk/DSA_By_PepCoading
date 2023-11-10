import java.util.Scanner;

public class D_PrintFactorial {

    public static int solution(int n){
        //Base Case 
        if(n==0){
            return 1;
        }

        int fnm1 = solution(n-1);
        int fact = n * fnm1;
        return fact;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+solution(n));
        sc.close();
    }
}
