
import java.util.ArrayList;
import java.util.Scanner;

public class A_PrintSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        System.out.println(getSubsequences(str));
        sc.close(); 
    }

    public static ArrayList<String> getSubsequences(String str){
        //Base case
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>(); 
            bres.add("");
            return bres;
        }

        //Approach
        char c = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getSubsequences(ros);

        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add(""+rstr);
            mres.add(c + rstr);
        }

        return mres;
    }
}
