import java.util.Scanner;

public class C_AllPelindromicSubstringsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.next();
        System.out.println("All Pelindromic Substrings: ");
        solution(s);
        sc.close();
    }

    private static void solution(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                String ss = s.substring(i, j);
                if(isPelindrome(s)){
                    System.out.println(ss);
                }
            }
        }
    }

    private static boolean isPelindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1 != ch2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
