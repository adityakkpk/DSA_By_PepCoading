import java.util.Scanner;

public class F_PrintZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        sc.close();
        pzz(n);
    }


    private static void pzz(int n) {
        if(n==0){
            return;
        }

        System.out.println("Pre "+ n);

        pzz(n-1);

        System.out.println("In "+ n);

        pzz(n-1);
        
        System.out.println("Post "+ n);
    }
}
