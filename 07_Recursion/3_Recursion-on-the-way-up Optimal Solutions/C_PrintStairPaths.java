import java.util.Scanner;

public class C_PrintStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stair height:");
        int n = sc.nextInt();
        System.out.println("Stair paths:");
        printSP(n,"");
        sc.close();
    }
    static void printSP(int n, String ans){
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(ans);
            return;
        }

        printSP(n-1, ans+"1");
        printSP(n-2, ans+"2");
        printSP(n-3, ans+"3");
    }
}
