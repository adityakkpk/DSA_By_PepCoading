import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter equation: ");
            String equation = sc.nextLine();

            Stack<Character> st = new Stack<>();

            for (int i = 0; i < equation.length(); i++) {
                char ch = equation.charAt(i);
                if(ch == '(' || ch=='{' || ch=='['){
                    st.push(ch);
                }else if(ch==')'){
                    boolean val = handleClosing(st, '(');
                    if(val==false){
                        System.out.println(val);
                        return;
                    }
                }else if(ch=='}'){
                    boolean val = handleClosing(st, '{');
                    if(val==false){
                        System.out.println(val);
                        return;
                    }
                }else if(ch==']'){
                    boolean val = handleClosing(st, '[');
                    if(val==false){
                        System.out.println(val);
                        return;
                    }
                }
            }
            if(st.size()==0){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
    public static boolean handleClosing(Stack<Character> st, char correspondChar){
        if(st.size()==0) return false;
        else if(st.peek()!= correspondChar) return false;
        else {
            st.pop();
            return true;
        }
    }
}
