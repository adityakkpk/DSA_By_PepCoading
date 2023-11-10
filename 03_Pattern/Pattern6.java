import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int r = in.nextInt();
        int sp= 1;
        int st = (r/2+1);
        for (int i  = 1; i<=r;i++){
//            System.out.println(st + "," + sp +","+st);
            for (int j = 1; j<=st; j++){
                System.out.print("*\t");
            }
            for (int j = 1; j<=sp; j++){
                System.out.print("\t");
            }
            for (int j = 1; j<=st; j++){
                System.out.print("*\t");
            }

            if (i<=r/2){
                st--;
                sp +=2;
            }else {
                st++;
                sp -=2;
            }
            System.out.println();
        }
        in.close();
    }
}
