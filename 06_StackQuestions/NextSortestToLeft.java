
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextSortestToLeft {
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
 
    public static int[] solve(int[] arr) { 
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr[0]);
        nse[0]=-1;

        for (int i=1;i<arr.length;i++) {
            while (st.size()>0 && arr[i]<= st.peek()) {
                st.pop();
            }
            if(st.size()==0){
                nse[i]=-1;
            }else{
                nse[i]= st.peek();
            }
            st.push(arr[i]); 
        }
        return nse;
    }


    public static void display(int[] a, int[] res){
        for (int i = 0; i < res.length; i++) {
            System.out.println("Next sortest left element for "+ a[i]+" is: "+res[i]);
        }
    }
}
