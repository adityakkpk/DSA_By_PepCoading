
import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int no = num;
        int count=0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Digits in "+ no + " is " + count);
        sc.close();
    }
}
