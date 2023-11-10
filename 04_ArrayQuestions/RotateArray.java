
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements:");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int rotate = 3;

        rotated(arr, rotate);

        System.out.println("Rotated Array Elements:"+ Arrays.toString(arr));
        
        sc.close();
    }
    private static void rotated(int[] arr, int r) {
        //for negative or larger rotations
        r = r%arr.length;
        if(r<0){
            r = arr.length+r;
        }


        //Reverse part1
        reverse(arr, 0, arr.length - 1 - r);

        //Reverse part2
        reverse(arr, arr.length - r, arr.length - 1);

        //Reverse all
        reverse(arr, 0, arr.length-1);
    }

    public static void reverse(int a[], int li, int ri){
        while(li<ri){
            int temp = a[li];
            a[li]= a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }
}
