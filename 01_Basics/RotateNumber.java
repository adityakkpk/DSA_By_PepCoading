
import java.util.*;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        System.out.print("Enter rotation: ");
        int r = in.nextInt();
        int tepm = n, count=0;
        while (tepm!=0){
            tepm=tepm/10;
            count++;
        }
        // Only for 0<n<count
//        for (int i=0;i<r;i++){
//            int rem = n%10;
//            n = n/10 + (rem* (int)Math.pow(10, count-1));
//        }
//        System.out.println("Rotated No: " + n);

        // for negative or greater than count
        r = r%count;
        if(r<0){
            r= count+r;
        }
        int div=1, mult=1;
        for (int i=1;i<=count; i++){
            if(i<=r){
                div=div*10;
            }else {
                mult = mult*10;
            }
        }
        int q = n/div;
        int rem = n%div;
        int res = rem*mult+q;
        System.out.println("Rotated No: " +res);
        in.close();
    }
}
