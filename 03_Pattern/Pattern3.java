import java.util.Scanner;

public class Pattern3 {
//                    *
//                   **
//                  ***
//                 ****
//                *****
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int r = in.nextInt();
        int sp= r-1;
        int st = 1;
        for (int i  = r; i>0;i--){
            for (int j = 1; j<=sp; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=st; j++){
                System.out.print("*");
            }
            st++;
            sp--;
            System.out.println();
        }
        in.close();
    }
}
