import java.util.ArrayList;
import java.util.Scanner;

class B_GetKeypadCombinatations{

    static String[] COMBINATION = {" ",".,:;","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 

    static ArrayList<String> getKC(String str){
        //Base Case
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        //Approach
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String combForCh = COMBINATION[ch-'0'];
        for (int i = 0; i < combForCh.length(); i++) {
            char c = combForCh.charAt(i);
            for (String rstr : rres) {
                mres.add(c+rstr);
            }
        }
        
        return mres;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter keys:");
        String str = sc.next();
        ArrayList<String> res = getKC(str);
        System.out.println(res);
        sc.close();
    }
}