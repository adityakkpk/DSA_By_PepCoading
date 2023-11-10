import java.util.Scanner;

public class K_FirstIndexInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter data");
        int d = sc.nextInt();
        System.out.println("First index of "+d+" in array is:"+firstIndex(arr, d,0));
        sc.close();
    }

    public static int firstIndex(int[] arr, int d, int idx){
        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==d){
            return idx;
        }else{
            return firstIndex(arr, d, idx+1);
        }
    }
}
