import java.util.Scanner;

public class E_XPowerN {

    public static int power(int x, int n){
        //Base Case
        if(n == 0){
            return 1;
        }

        int pnb2 = power(x, n/2);
        int pxn = pnb2*pnb2;
        if (x%2 != 0) {
            return pxn * x;
        }
        return pxn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(x+" Power "+n+" is: "+ power(x, n));
        sc.close();
    }
}
