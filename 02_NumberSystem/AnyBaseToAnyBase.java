import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary/Octal Number: ");
        int n = sc.nextInt();
        System.out.print("Enter base of input: ");
        int base1 = sc.nextInt();
        System.out.print("Enter base of output: ");
        int base2 = sc.nextInt();
        int res = getVal(n, base1, base2);
        System.out.println(n+" in base "+ base1+ " = "+ res+" in base "+base2);
        sc.close();
    }
    public static int getVal(int n, int b1, int b2){
        int dec = binaryOrOctalToDecimal(n,b1);
        int rv = decimalToAny(dec, b2);

        return rv;
    }
    public static int binaryOrOctalToDecimal(int n, int b){
        int rv=0;

        int pow = 1;// 10's power 0 =  1 so pow =1
        while (n>0){
            int rem = n%10;
            n = n/10;

            rv = rv+ rem*pow;
            pow = pow*b;
        }

        return rv;
    }
    public static int decimalToAny(int n, int b){
        int rv=0;

        int pow = 1;// 10's power 0 =  1 so pow =1
        while (n>0){
            int rem = n%b;
            n = n/b;

            rv = rv+ rem*pow;
            pow = pow*10;
        }

        return rv;
    }
}
