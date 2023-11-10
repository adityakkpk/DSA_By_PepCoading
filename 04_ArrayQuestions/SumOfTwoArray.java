
import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of array1:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of the Array2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of array1:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Sum of Array1 and Array2: ");
        int[] sum = new int[n1>n2? n1:n2];
        int c =0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;

        while(k>=0){
            int d = c;
            if(i>=0){
                d += arr1[i];
            }
            if(j>=0){
                d += arr2[j];
            }
            d = d%10;
            c = d/10;

            sum[k]=d;

            i--;
            j--;
            k--;
        }
        if(c != 0){
            System.out.println(c);
        }
        for (int val : sum) {
            System.out.println(val);
        }
    }
}
