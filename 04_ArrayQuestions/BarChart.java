
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>=floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
