import java.util.Scanner;

public class PAttern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int n = in.nextInt();
//        int sp=0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < sp; j++) {
//                System.out.print(" \t");
//            }
//            System.out.println("*");
//            sp++;
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==j){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
