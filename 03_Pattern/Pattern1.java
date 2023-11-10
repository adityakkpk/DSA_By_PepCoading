import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int r = in.nextInt();
        for (int i  = 1; i<=r;i++){
            for (int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}
