import java.util.Scanner;

public class B_PrintIncreasing {
    public static void printIncreasing(int n){
        //Base Case 
        if(n==0){
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printIncreasing(n);
        sc.close();
    }
}
