import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int n = sc.nextInt();
        int res = binaryToOctal(n);
        System.out.println(n+" in octal is "+ res);
        sc.close();
    }
    public static int binaryToOctal(int n){
        int dec = binaryToDecimal(n);
        int rv = decimalToBinary(dec);

        return rv;
    }
    public static int binaryToDecimal(int n){
        int rv=0;

        int pow = 1;// 10's power 0 =  1 so pow =1
        while (n>0){
            int rem = n%10;
            n = n/10;

            rv = rv+ rem*pow;
            pow = pow*2;
        }

        return rv;
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
