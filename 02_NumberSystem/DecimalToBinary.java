import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int binary = decimalToBinary(num);
        System.out.println("Binary of "+num+" is "+binary);
        sc.close();
    }
    public static int decimalToBinary(int n){
        int rv=0;

        int pow = 1;// 10's power 0 =  1 so pow =1
        while (n>0){
            int rem = n%2;
            n = n/2;

            rv = rv+ rem*pow;
            pow = pow*10;
        }

        return rv;
    }
}
