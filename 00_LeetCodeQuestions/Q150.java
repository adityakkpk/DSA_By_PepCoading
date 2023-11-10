
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Q150 {
    public static void main(String[] args) {
        String[] tockens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tockens));
    }
    public static int evalRPN(String[] tokens) {
        // Stack<String> st = new Stack<>();
        // for (int i = 0; i < tokens.length; i++) {

        //     String ch = tokens[i];
            

        //     if(ch=="+"||ch=="-"||ch=="*"||ch=="/"){
        //         int v2 = Integer.parseInt(st.pop());
        //         int v1 = Integer.parseInt(st.pop());
        //         String res = operation(v1, v2, ch);
        //         st.push(res);
        //     }else{
        //         st.push(ch);
        //     }
        // }

        // return Integer.parseInt(st.peek());

        //2nd Method
        Set<String> oper = new HashSet<>();
        oper.add("+");
        oper.add("-");
        oper.add("*");
        oper.add("/");
        var stack = new Stack<Integer>();
        int a = 0;
        int b = 0;

        for (int i = 0; i < tokens.length; i++) {
            if (oper.contains(tokens[i])) {
                switch (tokens[i]) {
                    case "+" -> {
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(a + b);
                    }
                    case "*" -> {
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(a * b);
                    }
                    case "/" -> {
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b / a);
                    }
                    case "-" -> {
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b - a);
                    }
                }
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
    // public static String operation(int a, int b,String op){
    //     if(op == "+"){
    //         return Integer.toString(a+b);
    //     } else if (op == "-"){
    //         return Integer.toString(a-b);
    //     }else if(op == "*"){
    //         return Integer.toString(a*b);
    //     } else{
    //         return Integer.toString(a/b);
    //     }
    // }
}
