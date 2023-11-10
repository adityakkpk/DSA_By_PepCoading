
import java.util.HashSet;
import java.util.Scanner;

public class B_AllSubstringsOFString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.next();
        HashSet<String> set = new HashSet<>();
        System.out.println("Substrings: ");
        subStrings(s, set);
        sc.close();
    }
    public static void subStrings(String s,HashSet<String> set){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                
                System.out.println(s.substring(i, j));

                //For all uniq subStrings
                // if(set.contains(s.substring(i, j))){
                //     return;
                // }else{
                //     System.out.println(s.substring(i, j));
                //     set.add(s.substring(i, j));
                // }
            }
        }
    }
}
