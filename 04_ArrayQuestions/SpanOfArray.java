
import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int span = max-min;
        System.out.println("Span: "+span);
        sc.close();

    } 
}
