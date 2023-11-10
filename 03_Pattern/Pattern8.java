import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int n = in.nextInt();
//        for (int i = n; i >0 ; i--) {
//            for (int j = i-1; j > 0; j--) {
//                System.out.print(" \t");
//            }
//            System.out.println("*");
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j==n+1){
                    System.out.print("*");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
