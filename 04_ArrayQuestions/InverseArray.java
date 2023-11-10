
import java.util.Arrays;
import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements:");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Inversed Array Elements:"+ Arrays.toString(inversed(arr)));
        
        sc.close();
    }
    public static int[] inversed(int[] arr){
        int[] inv = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            inv[val]= i;
        }

        return inv;
    }
}
