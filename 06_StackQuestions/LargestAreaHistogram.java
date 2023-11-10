import java.util.*;
import java.io.*;

public class LargestAreaHistogram {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter the hights of bars:");
        int[] bars = new int[n];
        for (int i = 0; i < bars.length; i++) {
            bars[i]=Integer.parseInt(br.readLine());
        }

        // fing the right boundry == next sortest element to right
        int[] rb = new int[bars.length];
        Stack<Integer> st = new Stack<>();

        st.push(bars.length-1);
        rb[bars.length-1]=bars.length;

        for (int i = bars.length-2; i >=0; i--) {
            while (st.size()>0 && bars[i]<= bars[st.peek()]) {
                st.pop();
            }
            if(st.size()==0){
                rb[i]=bars.length;
            }else{
                rb[i]= st.peek();
            }
            st.push(i); 
        }

        // find the left boundry == next sortest element to left
        int[] lb = new int[bars.length];
        st = new Stack<>();

        st.push(0);
        lb[0]=-1;

        for (int i = 1; i <bars.length; i++) {
            while (st.size()>0 && bars[i]<= bars[st.peek()]) {
                st.pop();
            }
            if(st.size()==0){
                lb[i]=-1;
            }else{
                lb[i]= st.peek();
            }
            st.push(i); 
        }

        // Area
        int maxArea = 0;
        for (int i = 0; i < lb.length; i++) {
            int width = rb[i]-lb[i] -1;
            int area = width*bars[i];
            if (area>maxArea) {
                maxArea=area;
            }
        }
        System.out.println(maxArea);
    }
}
