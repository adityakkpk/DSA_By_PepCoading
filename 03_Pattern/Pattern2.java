import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int r = in.nextInt();
        for (int i=r; i>0;i--){
            for (int j = 1; j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        in.close();
    }
}
