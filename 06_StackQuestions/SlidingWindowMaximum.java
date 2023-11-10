
import java.io.*;
import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Array size:");
        int n= Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        System.out.println("Elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(br.readLine());
        }
        System.out.print("Enter Window size:");
        int window = Integer.parseInt(br.readLine());


        // next greater right
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[arr.length];

        st.push(arr.length-1);
        nge[arr.length-1]=arr.length;

        for (int i = arr.length-2; i >=0; i--) {
            while (st.size()>0 && arr[i]>= arr[st.peek()]) {
                st.pop();
            }
            if(st.size()==0){
                nge[i]=arr.length;
            }else{
                nge[i]=st.peek();
            }
            st.push(i);
        }

        int oa = (arr.length)-window+1;
        int res[] = new int[oa];
        // Code
        int j=0;
        for (int i = 0; i < arr.length-window; i++) {
            // enter the loop to fing the maximum of window starting at i
            if(j<i){
                j=i;
            }
            while(nge[j]<i+window){
                j=nge[j];
            }
            res[i]=arr[j];
        }
        System.out.println(Arrays.toString(res));
    }
}
