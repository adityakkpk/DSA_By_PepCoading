
import java.util.Scanner;

public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the sorted Array Elements:");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("Subsets: ");
        int limit = (int)Math.pow(2, n);

        for (int i = 0; i < limit; i++) {
            int temp = i;
            String set ="";
            for (int j = n-1; j >=0; j--) {
                int rem = temp%2;
                temp=temp/2;
                if(rem==0){
                    set= "-\t"+ set;
                }else{
                    set=arr[j]+"\t"+set;
                }
            }
            System.out.println(set);
        }
    }
}
