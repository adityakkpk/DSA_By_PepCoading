import java.util.ArrayList;
import java.util.Scanner;

public class C_CountStairPaths {
    
    static ArrayList<String> getPaths(int n){

        //Base Cases
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        //Approach
        ArrayList<String> paths1 = getPaths(n-1);
        ArrayList<String> paths2 = getPaths(n-2);
        ArrayList<String> paths3 = getPaths(n-3);
        ArrayList<String> paths = new ArrayList<>();

        for (String path : paths1) {
            paths.add("1"+path);
        }
        for (String path : paths2) {
            paths.add("2"+path);
        }
        for (String path : paths3) {
            paths.add("3"+path);
        }

        return paths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stair height: ");
        int n = sc.nextInt();
        ArrayList<String> res = getPaths(n);
        System.out.println("Paths:" + res);
        sc.close();
    }
}
