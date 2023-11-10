import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int r = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i  = 1; i<=r;i++){
            for (int j = 1; j<=i;j++){
                System.out.print(a+"\t");
                int c = a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
        in.close();
    }
}
