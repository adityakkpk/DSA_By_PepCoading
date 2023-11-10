import java.util.Scanner;

public class B_PrintKeypadCombi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Keys:");
        String str = sc.nextLine();
        System.out.println("Key combinations:");
        printKC(str, "");
        sc.close();
    }

    static String[] CODES = {" ",".,:;","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    static void printKC(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        String codesforCh = CODES[ch -'0'];
        for (int i = 0; i < codesforCh.length(); i++) {
            char c = codesforCh.charAt(i);
            printKC(ros, ans+c);
        }
    }
}
