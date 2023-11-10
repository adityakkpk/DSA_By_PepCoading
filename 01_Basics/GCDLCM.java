
public class GCDLCM {
    public static void main(String[] args) {
        int n1=36;
        int n2=24;
        int on1 = n1;
        int on2 = n2;
        while (n1%n2 !=0){
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (on1*on2)/gcd;//lcm*gcd=on1*on2(product of lcm and gcd of any two numbers is equal to the product of the numbers.)
        System.out.println("GCD= "+ gcd+" LCM= " + lcm);
    }
}
