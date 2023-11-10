import java.util.Scanner;

public class OctalToOctalAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Octal number1: ");
        int num1 = scn.nextInt();
        System.out.print("Enter Octal number2: ");
        int num2 = scn.nextInt();

        int res = getSum(num1, num2);
        System.out.println("Sum of "+num1+" and "+num2+" is: "+res);
        scn.close();
    }

    public static int getSum(int n1, int n2){
        int rv = 0;
        int pow=1;
        int carry = 0;
        while (n1>0||n2>0||carry>0){
            int rem1 = n1%10;
            int rem2 = n2%10;
            n1=n1/10;
            n2=n2/10;
            
            int d = rem1+rem2+carry;
            carry=d/8;
            d=d%8;

            rv=rv+ d*pow;
            pow=pow*10;
        }

        return rv;
    }
}
