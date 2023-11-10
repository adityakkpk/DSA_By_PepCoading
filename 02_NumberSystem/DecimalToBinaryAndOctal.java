import java.util.Scanner;

public class DecimalToBinaryAndOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int n = sc.nextInt();
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        int res = decimalToAny(n, base);
        System.out.println(n+" is "+ res);
        sc.close();
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
