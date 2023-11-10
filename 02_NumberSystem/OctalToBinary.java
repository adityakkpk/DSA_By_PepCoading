import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Octal Number: ");
        int n = sc.nextInt();
        int res = octalToBinary(n);
        System.out.println(n+" in binary is "+ res);
        sc.close();
    }

    public static int octalToBinary(int n){
        int dec = octalToDecimal(n);
        int rv = decimalToBinary(dec);

        return rv;
    }

    private static int decimalToBinary(int n) {
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

    private static int octalToDecimal(int n) {
        int rv=0;

        int pow = 1;// 10's power 0 =  1 so pow =1
        while (n>0){
            int rem = n%10;
            n = n/10;

            rv = rv+ rem*pow;
            pow = pow*8;
        }

        return rv;
    }
}
