import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int r = in.nextInt();
        int val = 1;
        for (int i  = 1; i<=r;i++){
            for (int j = 1; j<=i;j++){
                System.out.print(val+"\t");
                val++;
            }
            System.out.println();
        }
        in.close();
    }
}
