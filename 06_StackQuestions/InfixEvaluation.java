
import java.io.*;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Expression:");
        String exp = br.readLine();

        Stack<Character> operators = new Stack<>();
        Stack<Integer> operands = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch=='('){
                operators.push(ch);
            }else if(Character.isDigit(ch)){
                operands.push(ch-'0');//char to int
            }else if(ch ==')'){
                while(operators.peek()!= '('){
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opr = operation(v1, v2, operator);
                    operands.push(opr);
                }
                operators.pop();
            }else if(ch == '+'  || ch == '-'  || ch == '*'  || ch == '/'){
                // ch is wanting higher priority/ precedency operators to solve 
                while (operators.size()>0 && operators.peek() != '(' && precedency(operators.peek())>=precedency(ch)) {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opr = operation(v1, v2, operator);
                    operands.push(opr);                 
                }

                //ch is pushing itself
                operators.push(ch);
            }
        }
        while(operators.size()!= 0){
            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();

            int opr = operation(v1, v2, operator);
            operands.push(opr);
        }
        System.out.println("Solution:"+operands.peek());
    }

    public static int precedency(char operator){
        if(operator == '+'){
            return 1;
        } else if (operator == '-'){
            return 1;
        }else if(operator == '*'){
            return 2;
        } else{
            return 2;
        }
    }

    public static int operation (int a, int b, char operator){
        if(operator == '+'){
            return a+b;
        } else if (operator == '-'){
            return a-b;
        }else if(operator == '*'){
            return a*b;
        } else{
            return a/b;
        }
    }
}
