
import java.util.Stack;

public class Q155MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());   // return 0
        System.out.println(minStack.getMin()); // return -2
    }

}

class MinStack{
    Stack<Integer> st  = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        int p = st.pop();
        if(min.peek()== p){
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
