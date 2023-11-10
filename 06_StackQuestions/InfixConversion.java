import java.util.*;
import java.io.*;

public class InfixConversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the infix expression:");
        String exp = br.readLine();

        Stack<Character> opr = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch=='('){
                opr.push(ch);
            }else if((ch>= '0'&& ch<='9')||(ch>='a' && ch<='z')||(ch >= 'A' && ch<='Z')){
                prefix.push(ch+"");// char to String
                postfix.push(ch+"");// char to String
            }else if(ch==')'){
                while(opr.peek()!='('){
                    process(opr, prefix, postfix);
                }
                opr.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(opr.size()>0 && opr.peek() != '(' && precedency(opr.peek())>=precedency(ch)){
                    process(opr, prefix, postfix);
                }
                opr.push(ch);
            }
        }
        while(opr.size()>0){
            process(opr, prefix, postfix);
        }
        System.out.println("Prefix expression: " +prefix.peek());
        System.out.println("Postfix expression: " +postfix.peek());
    }
    private static int precedency(char op) {
        if(op=='+'||op=='-') return 1;
        else if(op=='*'||op=='/') return 2;
        else return 0;
    }
    public static void process(Stack<Character> opr, Stack<String> prefix, Stack<String> postfix){
        char op = opr.pop();
        String postV2 = postfix.pop();
        String postV1 = postfix.pop();
        String postV = postV1+postV2+op;
        postfix.push(postV);
        String preV2 = prefix.pop();
        String preV1 = prefix.pop();
        String preV = op+preV1+preV2;
        prefix.push(preV);
    }
}
