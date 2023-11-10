
import java.util.Scanner;

public class A_PelindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();
        System.out.println(s+" is Pelindrome: "+isPelindrome(s));
        sc.close();
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
