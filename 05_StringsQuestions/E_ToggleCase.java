
import java.util.Scanner;

public class E_ToggleCase {

    public static String toggleCase(String s){
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if( ch >='a' && ch <= 'z'){
                char up = (char)('A' + ch-'a');
                sb.setCharAt(i, up);
            }else if(ch >='A' && ch <= 'Z'){
                char lw = (char)('a' + ch-'A');
                sb.setCharAt(i, lw);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(toggleCase(s));

    }
}
