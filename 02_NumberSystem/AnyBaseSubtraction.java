import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Base(2 or 8) of Numbers: ");
        int base = scn.nextInt();
        System.out.print("Enter the number1: ");
        int num1 = scn.nextInt();
        System.out.print("Enter the number2(< number1): ");
        int num2 = scn.nextInt();

        int res = getDiff(base, num1, num2);
        System.out.println("Differance of "+num1+" and "+num2+" in base "+base+" is: "+res);
        scn.close();
    }

    public static int getDiff(int b, int n1, int n2){
        int rv = 0;
        int pow=1;
        int borrow = 0;
        while (n2>0){
            int rem1 = n1%10;
            n1=n1/10;
            int rem2 = n2%10;
            n2=n2/10;

            int d=0;
            rem1=rem1+borrow;

            if(rem1>=rem2){
                borrow=0;
                d = rem1-rem2;
            }else {
                borrow = -1;
                d = (rem1+b)-rem2;
            }
            rv=rv + d *pow;
            pow=pow*10;
        }

        return rv;
    }

}
