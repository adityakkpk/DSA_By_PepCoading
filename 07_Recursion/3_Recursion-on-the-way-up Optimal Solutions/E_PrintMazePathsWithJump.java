import java.util.Scanner;

public class E_PrintMazePathsWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter destination:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMPWJ(0,0,n-1,m-1,"");
        sc.close();
    }

    static void printMPWJ(int sr, int sc, int dr, int dc, String ans){
        //Normal Bace Case
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }

        //Smart call
        for (int i = 1; i <= dr-sr; i++) {
            printMPWJ(sr+i, sc, dr, dc, ans+"v"+i);
        }
        for (int i = 1; i <= dc-sc; i++) {
            printMPWJ(sr, sc+i, dr, dc, ans+"h"+i);
        }
        for (int i = 1; i <= dr-sr && i <= dc-sc; i++) {
            printMPWJ(sr+i, sc+i, dr, dc, ans+"d"+i);
        }
    }
}
