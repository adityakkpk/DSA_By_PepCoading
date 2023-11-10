
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixEvaluationAndConversion {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Expression:");
        String exp = br.readLine();

        Stack<Integer> values = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
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

                String prefv2 = prefix.pop();
                String prefv1 = prefix.pop();
                String prefv = ch + prefv1+prefv2;
                prefix.push(prefv);

            }else{
                values.push(ch - '0');
                infix.push(ch + "");
                prefix.push(ch + "");
            }
        }
        System.out.println("Expression result: "+ values.peek());
        System.out.println("Infix Expression: "+ infix.peek());
        System.out.println("Prefix Expression: "+ prefix.peek());
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
