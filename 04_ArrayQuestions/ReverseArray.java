import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Elements:");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("Reversed Array Elements:");
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
