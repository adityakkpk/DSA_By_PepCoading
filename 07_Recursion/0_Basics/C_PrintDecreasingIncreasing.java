import java.util.Scanner;

public class C_PrintDecreasingIncreasing {
    public static void solution(int n){
        //Base Case 
        if(n==0){
            return;
        }

        System.out.println(n);
        solution(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        solution(n);
        sc.close();
    }
}
