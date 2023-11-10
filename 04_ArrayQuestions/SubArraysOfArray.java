
import java.util.Scanner;

public class SubArraysOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements:");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("Subarrays :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
              for (int k = i; k <= j; k++) {
                System.out.print(arr[k] + "	");
              }
              System.out.println();
            }
        }
    }
}
