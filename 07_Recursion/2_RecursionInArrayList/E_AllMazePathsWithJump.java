import java.util.ArrayList;
import java.util.Scanner;

public class E_AllMazePathsWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Destination's indexes:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> res = getMazePathsWithJump(1,1,n,m);
        System.out.println(res);
        sc.close();
    }
    static ArrayList<String> getMazePathsWithJump(int sr, int sc, int dr,int dc){
        //Base case
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        //Approach

        ArrayList<String> paths = new ArrayList<>();

        //Horizontal Jumps
        for (int hj = 1; hj <= dc-sc; hj++) {
            ArrayList<String> hpaths = getMazePathsWithJump(sr, sc+hj, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h"+hj+hpath);
            }
        }

        //Vertical Jumps
        for (int vj = 1; vj <= dr-sr; vj++) {
            ArrayList<String> vpaths = getMazePathsWithJump(sr+vj, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v"+vj+vpath);
            }
        }

        //Diagonal Jumps
        for (int j = 1; j <= dc-sc && j<=dr-sr; j++) {
            ArrayList<String> dpaths = getMazePathsWithJump(sr+j, sc+j, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d"+j+dpath);
            }
        }

        return paths;
    }
}
