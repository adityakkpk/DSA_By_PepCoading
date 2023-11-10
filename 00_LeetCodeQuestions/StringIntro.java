
import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] x = A.toCharArray();
        char[] y = B.toCharArray();
        
        System.out.println(x.length + y.length);
        
        if(x[0]>y[0]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        StringBuffer sb = new StringBuffer(A);
        sb.setCharAt(0,  (char)('A' +  x[0] - 'a'));
        
        StringBuffer sb1 = new StringBuffer(B);
        sb1.setCharAt(0,  (char)('A' +  y[0] - 'a'));
        System.out.print(sb+" "+sb1);

        sc.close();
    }
    
}
