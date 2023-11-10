import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M_AllIndexes {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Array size: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        System.out.println("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Enter data:");
        int d = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(allIndexes(arr, d, 0, 0)));
    }

    private static int[] allIndexes(int[] arr, int d, int idx, int fsf) {
        //Base Case
        if(idx == arr.length){
            return new int[fsf];
        }

        //Approach
        if(arr[idx]==d){
            int[] iarr = allIndexes(arr, d, idx+1, fsf+1);
            iarr[fsf] = idx;
            return iarr;
        }else{
            int[] iarr = allIndexes(arr, d, idx+1, fsf);
            return iarr;
        }
    }
}
