import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int octal = decimalToOctal(num);
        System.out.println("Octal of "+num+" is "+octal);
        sc.close();
    }
    public static int decimalToOctal(int n){
        int rv=0;

        int pow = 1;// 10's power 0 =  1 so pow =1
        while (n>0){
            int rem = n%8;
            n = n/8;

            rv = rv+ rem*pow;
            pow = pow*10;
        }

        return rv;
    }
}
