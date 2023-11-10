import java.util.Scanner;

class TargetSumSubset{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subset length:");
        int n = sc.nextInt();
        System.out.println("Enter subset Elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target: ");
        int t = sc.nextInt();
        printTSS(arr, 0, "", 0, t);
        sc.close();
    }

    private static void printTSS(int[] arr, int idx, String ans, int sum, int target) {
        if(idx == arr.length){
            if(sum == target){
                System.out.println(ans+", ");
            }
            return;
        }

        printTSS(arr, idx+1, ans+arr[idx]+", ", sum+arr[idx], target);
        printTSS(arr, idx+1, ans, sum, target);
    }
}