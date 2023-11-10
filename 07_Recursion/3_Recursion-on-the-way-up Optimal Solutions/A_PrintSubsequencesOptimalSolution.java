import java.util.Scanner;

public class A_PrintSubsequencesOptimalSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Substrings are:");
        printSS(str, "");
        sc.close();
    }

    static void printSS(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        //Charecter aayega
        printSS(ros, ans+ch);

        //Charecter nahi aayega
        printSS(ros, ans+"");

    }
}
