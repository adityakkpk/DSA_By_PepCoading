import java.util.Scanner;

public class G_Encoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to be encoaded:");
        String str = sc.nextLine();
        System.out.println("Encodings:");
        printEncoding(str,"");
        sc.close();
    }

    static void printEncoding(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }else if(str.length()==1){
            char ch = str.charAt(0);
            if(ch=='0'){
                return;
            }else{
                int chv = ch - '0';
                char code = (char)('a'+chv-1);
                ans = ans+code;
                System.out.println(ans);
            }
        }else{
            char ch = str.charAt(0);
            String ros = str.substring(1);

            if(ch=='0'){
                return;
            }else{
                int chv = ch-'0';
                char code = (char)('a'+chv-1);
                printEncoding(ros, ans+code);
            }

            String ch12 = str.substring(0,2);
            String ros12 = str.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if(ch12v<=26){
                char code = (char)('a'+ch12v-1);
                printEncoding(ros12, ans+code);
            }
        }
    }
}
