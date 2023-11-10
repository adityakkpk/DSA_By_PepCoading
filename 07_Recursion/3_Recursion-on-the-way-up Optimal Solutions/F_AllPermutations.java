import java.util.Scanner;

class A_AllPermutations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();
        printPermutations(str,"");
        sc.close();
    }

    static void printPermutations(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i)+ str.substring(i+1);
            printPermutations(ros, ans+ch);
        }
    }
}