
import java.util.Scanner;

public class FirstAndLastIndexOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the sorted Array Elements:");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        sc.close();

        int left=0;
        int right= arr.length;
        int fi=-1;//First index
        while(left<=right){
            int mid = (left+right)/2;
            if(data > arr[mid]){
                left = mid+1;
            }else if(data< arr[mid]){
                right = mid-1;
            }else{
                fi=mid;
                right = mid-1;
            }
        }
        left=0;
        right= arr.length;
        int li=-1;//left index
        while(left<=right){
            int mid = (left+right)/2;
            if(data > arr[mid]){
                left = mid+1;
            }else if(data< arr[mid]){
                right = mid-1;
            }else{
                li=mid;
                left = mid+1;
            }
        }
        System.out.println("First index of "+data+" is: "+ fi);
        System.out.println("Last index of "+data+" is: "+ li);
    }
}
