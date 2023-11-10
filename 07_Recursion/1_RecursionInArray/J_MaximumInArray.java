import java.util.Scanner;

class J_MaximumInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Max in arry is:"+maxInArray(arr, 0));
        sc.close();
    }

    public static int maxInArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int max_in_short_array = maxInArray(arr, idx+1);
        if(max_in_short_array>arr[idx]){
            return max_in_short_array;
        }else{
            return arr[idx];
        }
    }
}