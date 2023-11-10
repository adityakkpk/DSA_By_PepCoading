
import java.util.Arrays;
import java.util.Stack;

class Q496{
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {5,4,3,2,1};
        int[] nge =nextGreatElement(nums2);
        int[] res = new int[nums1.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    res[i]=nge[j];
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
    public static int[] nextGreatElement(int[] arr) { 
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size()> 0 && arr[i]>arr[st.peek()]) {
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
    
}