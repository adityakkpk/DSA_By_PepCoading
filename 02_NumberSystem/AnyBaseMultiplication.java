import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Base(2 or 8) of Numbers: ");
        int base = scn.nextInt();
        System.out.print("Enter the number1: ");
        int num1 = scn.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = scn.nextInt();

        int res = getProduct(base, num1, num2);
        System.out.println("Multiplication of "+num1+" and "+num2+" in base "+base+" is: "+res);
        scn.close();
    }

    public static int getProduct(int b, int n1, int n2){
        int rv = 0;
        int pow = 1;
        while (n2>0){
            int d2 = n2%10;
            n2 = n2/10;
            int separate = getProductWithSingleDigit(b, n1, d2);
            rv = getSum(b, rv, separate*pow);
            pow = pow*10;
        }
        return rv;
    }

    public static int getProductWithSingleDigit(int b, int n1, int d2){
        int rv = 0;
        int c=0;
        int pow=1;
        while(n1>0||c>0){
            int d1 = n1%10;
            n1=n1/10;
            int d = d1*d2+c;
            c=d/b;
            d=d%b;
            rv = rv+d*pow;
            pow = pow*10;
        }
        return rv;
    }

    public static int getSum(int b, int n1, int n2){
        int rv = 0;
        int pow=1;
        int carry = 0;
        while (n1>0||n2>0||carry>0){
            int rem1 = n1%10;
            int rem2 = n2%10;
            n1=n1/10;
            n2=n2/10;
            int d = rem1+rem2+carry;
            carry=d/b;
            d=d%b;

            rv=rv+ d*pow;
            pow=pow*10;
        }

        return rv;
    }
}
