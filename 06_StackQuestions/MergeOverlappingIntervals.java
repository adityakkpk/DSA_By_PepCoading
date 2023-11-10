import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MergeOverlappingIntervals {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Interval Counts: ");
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            arr[i][0] = Integer.parseInt(line.split(" ")[0]);
            arr[i][1] = Integer.parseInt(line.split(" ")[0]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] +" " +arr[i][1]);
        }

    }
}
