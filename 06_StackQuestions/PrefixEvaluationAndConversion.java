
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PrefixEvaluationAndConversion {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Expression:");
        String exp = br.readLine();

        Stack<Integer> values = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = exp.length()-1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if(ch == '+'  || ch == '-'  || ch == '*'  || ch == '/'){
                int v2 = values.pop();
                int v1 = values.pop();
                int v = operation(v1, v2, ch);
                values.push(v); 
                
                String infv2 = infix.pop();
                String infv1 = infix.pop();
                String infv = "("+infv1+ch+infv2+")";
                infix.push(infv);

                String pfv2 = postfix.pop();
                String pfv1 = postfix.pop();
                String pfv = pfv1+pfv2+ch;
                postfix.push(pfv);

            }else{
                values.push(ch - '0');
                infix.push(ch + "");
                postfix.push(ch + "");
            }
        }
        System.out.println("Expression result: "+ values.peek());
        System.out.println("Infix Expression: "+ infix.peek());
        System.out.println("Postfix Expression: "+ postfix.peek());
    }

    private static int operation(int a, int b, char ch) {
        if(ch == '+'){
            return a+b;
        } else if (ch == '-'){
            return a-b;
        }else if(ch == '*'){
            return a*b;
        } else{
            return a/b;
        }
    }
}
