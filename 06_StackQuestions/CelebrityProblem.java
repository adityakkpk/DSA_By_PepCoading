import java.util.*;
import java.io.*;

// Celebrity: Known By everyone and knows noone.
public class CelebrityProblem {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            String line = br.readLine();
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = line.charAt(j)+ '0';
            }
        }
        findCelebrity(arr);
    }
    public static void findCelebrity(int[][] arr){
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while (st.size()>=2) {
            int  i = st.pop();
            int  j = st.pop();

            if(arr[i][j]==1){// if i knows j -> i isn't a celebrity, j is
                st.push(j);
            }else{// if i doesn't knows j -> i is a celebrity, j isn't a celebrity
                st.push(i);
            }
        }
        int potential = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if(i != potential){
                if(arr[i][potential]==0 || arr[potential][i]==1){
                    System.out.println("none");
                    return;
                }
            }
        }
        System.out.println(potential);
    }
}


