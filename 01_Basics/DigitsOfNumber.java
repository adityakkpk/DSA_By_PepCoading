
import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        System.out.println("Digits in " + n + " is:");
        int div = (int)Math.pow(10, count - 1);
        while (n!=0){
            int dig = n/div;
            System.out.println(dig);
            n = n%div;
            div = div/10;
        }
        sc.close();
    }
}
