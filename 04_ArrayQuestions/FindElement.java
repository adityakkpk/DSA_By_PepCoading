
import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number which you want to find in array: ");
        int num = sc.nextInt();
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]==num){
                idx=i;
                break;
            } 
        }
        System.out.println(idx);
        sc.close();
    }
}
