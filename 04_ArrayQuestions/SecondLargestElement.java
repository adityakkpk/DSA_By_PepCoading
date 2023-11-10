
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Second largest: "+secondLargest(arr));
        
        sc.close();
    }
    public static int secondLargest(int[] a){
        int first=a[0];
        int second=a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>first){
                second=first;
                first=a[i];
            }else if(a[i]>second){
                second=a[i];
            }
        }
        return second;
    }
}
