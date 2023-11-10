
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the sorted Array Elements:");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter data to be found: ");
        int data = sc.nextInt();
        sc.close();
        int l=0;
        int h=arr.length-1;

        while(l<=h){
            int m = (l+h)/2;
            if(data>arr[m]){
                l=m+1;
            }else if(data<arr[m]){
                h=m-1;
            }else{
                System.out.println("Found at index: "+m);
                return;
            }
        }
        
        System.out.println("Not found!!");
    }
}
