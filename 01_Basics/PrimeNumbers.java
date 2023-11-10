
import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prime Numbers
//        int t = sc.nextInt();
//        for(int i=0; i<t; i++){
//            int n = sc.nextInt();
//            int count = 0;
//            for (int div=2; div*div<=n; div++){
//                if(n%div==0){
//                    count++;
//                    break;
//                }
//            }
//            if (count!=0){
//                System.out.println("Not Prime");
//            } else {
//                System.out.println("Prime");
//            }
//        }

        // Prime Numbers between a range
        int low, high;
        System.out.println("Enter the range:");
        low = sc.nextInt();
        high = sc.nextInt();
        System.out.println("Checking:");
        for (int i=low; i<=high; i++){
            int count=0;
            for (int div=2; div*div<=i; div++){
                if(i%div==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i + " is Prime");
            }
        }
        sc.close();
    }
}
