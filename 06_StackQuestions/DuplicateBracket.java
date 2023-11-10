import java.util.*;

public class DuplicateBracket {
    public static void main(String[] args) throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter equation: ");
            String equation = sc.nextLine();

            Stack<Character> st = new Stack<>();

            for (int i = 0; i < equation.length(); i++) {
                char ch = equation.charAt(i);
                if(ch==')'){
                    if(st.peek()=='('){
                        System.out.println(true);
                        return;//for terminationg the function
                    }
                    else{
                        while (st.peek()!='(') {
                            st.pop();
                        }
                        st.pop();//for removing remaining '('
                    }
                }else{
                    st.push(ch);
                }
            }
            System.out.println(false);
            sc.close();
        }
    }
}
