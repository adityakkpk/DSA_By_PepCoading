// *   * * *
// *   *
// * * * * *
//     *   *
// * * *   *
import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter odd number of rows: ");
        int n = in.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==1){
                    if(j==1 || j>=n/2+1){
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                } else if(i<=n/2){
                    if(j==1 || j==n/2+1){
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                }else  if(i==n/2+1){
                    System.out.print("*\t");
                }else if(i<n){
                    if(j==n || j==n/2+1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else {
                    if(j==n || j<=n/2+1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
        in.close();
    }
}
