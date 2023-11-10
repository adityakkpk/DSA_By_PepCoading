import java.util.Scanner;

class A_PrintDecreasing{
    
    public static void printDecreasing(int n){
        //Base Case 
        if(n==0){
            return;
        }

        System.out.println(n);
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printDecreasing(n);
        sc.close(); 
    }
}