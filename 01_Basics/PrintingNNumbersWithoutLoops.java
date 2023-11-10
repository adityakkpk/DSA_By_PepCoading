
import java.util.Scanner;

public class PrintingNNumbersWithoutLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
        sc.close();
    }
    public static void printNumber(int n){
        if(n>1){
            printNumber(n-1);
        }
        System.out.println(n);
    }
}
