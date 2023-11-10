//          1
//      2	3	2
//  3	4	5	4	3
//      2	3	2
//          1
import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the odd numbers of rows:");
        int r = sc.nextInt();
        int sp= r/2;
        int st = 1;
        int val=1;
        for (int i  = 1; i<=r;i++){
            for (int j = 1; j<=sp; j++){
                System.out.print("\t");
            }
            int cval=val;
            for (int j = 1; j<=st; j++){
                System.out.print(cval+"\t");
                if(j<=st/2){
                    cval++;
                }else {
                    cval--;
                }
            }
            if (i<=r/2){
                sp--;
                st +=2;
                val++;
            }else {
                sp++;
                st -=2;
                val--;
            }

            System.out.println();
        }
        sc.close();
    }
}
