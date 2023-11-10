
import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid number: ");
        int n = sc.nextInt();
        int rem = 0, count=0, inv=0;
        while (n!=0){
            rem = n%10;
            count++;
            inv = inv + count * (int)Math.pow(10, rem-1);
            n=n/10;
        }
        System.out.println("Inverted number: " + inv);
        sc.close();
    }
}
