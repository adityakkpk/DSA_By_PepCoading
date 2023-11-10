import java.util.Scanner;

public class BinaryOrOctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary/Octal Number: ");
        int n = sc.nextInt();
        System.out.print("Enter base of input: ");
        int base = sc.nextInt();
        int res = binaryOrOctalToDecimal(n, base);
        System.out.println(n+" in base "+base+" is "+ res);
        sc.close();
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
}
