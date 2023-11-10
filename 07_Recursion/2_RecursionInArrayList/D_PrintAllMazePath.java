import java.util.*;

class D_PrintAllMazePath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Destination's indexes:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> res = getMazePaths(1,1,n,m);
        System.out.println(res);
        sc.close();
    }
    static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        //Base Case
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        //Approach
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sr<dr){
            vpaths = getMazePaths(sr+1, sc, dr, dc);
        }

        if(sc<dc){
            hpaths = getMazePaths(sr, sc+1, dr, dc);
        }

        ArrayList<String> mres = new ArrayList<>();

        for (String vpath : vpaths) {
            mres.add("v"+vpath);
        }
        for (String hpath : hpaths) {
            mres.add("h"+hpath);
        }
        return mres;
    }
}