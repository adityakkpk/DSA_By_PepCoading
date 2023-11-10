import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Octal Number: ");
        int n = sc.nextInt();
        int res = octalToDecimal(n);
        System.out.println(n+" in decimal is "+ res);
        sc.close();
    }
    public static int octalToDecimal(int n){
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
