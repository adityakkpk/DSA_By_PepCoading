
import java.util.Scanner;

public class CeilAndFloor {
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

        int low = 0;
        int high = arr.length - 1;
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];
            }
            else if (data > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            } else {
                ceil = floor = arr[mid];
                break;
            }

        }
        System.out.println ("Ceil: "+ceil);
        System.out.println ("Floor: "+floor);

    }
}
