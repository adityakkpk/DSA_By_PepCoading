
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.print("Enter digit: ");
        int d = sc.nextInt();
        int f = digitFrequency(n, d);
        System.out.println("Count of " +d+" in " + n+ " is "+ f);
        sc.close();
    }
    public static int digitFrequency(int n, int d){
        int rv =0;

        while (n>0){
            int rem = n%10;
            n = n/10;
            if(rem == d){
                rv++;
            }
        }
        return rv;
    }
}
