
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        // Stack Implementation
        Stack<Integer> s = new Stack<>(); 
        
        // methods
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Stack :"+s+", Peak/Top: "+s.peek()+", size: "+s.size());

        s.pop();
        System.out.println("Stack :"+s+", Peak/Top: "+s.peek()+", size: "+s.size());
        s.pop();
        System.out.println("Stack :"+s+", Peak/Top: "+s.peek()+", size: "+s.size());
        s.pop();
        System.out.println("Stack :"+s+", Peak/Top: "+s.peek()+", size: "+s.size());   
        s.pop();     
        System.out.println("Stack :"+s+", Peak/Top: "+s.peek()+", size: "+s.size());    
        s.pop();    
        System.out.println("Stack :"+s+", Peak/Top: "+s.peek()+", size: "+s.size());        
        
    }
}
