
import java.io.*;
import java.util.*;

public class NextGreaterRight {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of Array:");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        System.out.println("Enter the elements of Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(br.readLine());
        }

        int[] nextGreatElements = solve(arr);
        display(arr, nextGreatElements); 
    }

    //Right to left solution
    // private static int[] solve(int[] arr) { 
    //     int[] nge = new int[arr.length];
    //     Stack<Integer> st = new Stack<>();

    //     st.push(arr[arr.length-1]);
    //     nge[arr.length-1]=-1;

    //     for (int i = arr.length-2; i >=0; i--) {

    //         while (st.size()>0 && arr[i]>=st.peek()) {
    //             st.pop();
    //         }

    //         if(st.size()==0){
    //             nge[i]=-1;
    //         }else{
    //             nge[i]= st.peek();
    //         }
            
    //         st.push(arr[i]);
    //     }

    //     return nge;
    // }
    

    //Left to right solution
    private static int[] solve(int[] arr) { 
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size()> 0 && arr[i]>=arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        while(st.size()>0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }

        return nge;
    }

    // public static void display(int[] a, int[] res){
    //     StringBuilder sb = new StringBuilder();
    //     for (int val : a) {
    //         sb.append(val + " ");
    //     }
    //     System.out.println(sb);
    // }
    public static void display(int[] a, int[] res){
        for (int i = 0; i < res.length; i++) {
            System.out.println("Next right element for "+ a[i]+" is: "+res[i]);
        }
    }
}
