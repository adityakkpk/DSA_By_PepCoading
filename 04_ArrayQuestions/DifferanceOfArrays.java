
import java.util.Scanner;

public class DifferanceOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of array1:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of the Array2(> Array1): ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of array2:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Differance of Array1 and Array2: ");
        int[] diff = new int[n2];
        int c =0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;

        while(k>=0){
            int d=0;
            int arr1Val = i>=0? arr1[i] : 0;
            if(arr2[j]+c >= arr1Val){
                d = arr2[j]+c-arr1Val;
            }else{
                d = arr2[j]+c+10 -arr1Val;
                c = -1;
            }
            diff[k]= d;
            
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx < diff.length){
            if (diff[idx]==0) {
                idx++;
            } else {
                break;
            }
        }
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
        sc.close();
    }
}
