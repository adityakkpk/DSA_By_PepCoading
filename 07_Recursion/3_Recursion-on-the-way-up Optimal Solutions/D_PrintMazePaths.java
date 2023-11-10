import java.util.Scanner;

public class D_PrintMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter destination:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMP(1,1,n,m,"");
        sc.close();
    }

    static void printMP(int sr, int sc, int dr, int dc, String ans){
        //Smar Base Case
        if(sc>dr||sr>dr){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }

        //Normal Call
        printMP(sr, sc+1, dr, dc, ans+"h");
        printMP(sr+1, sc, dr, dc, ans+"v");
    }
}
