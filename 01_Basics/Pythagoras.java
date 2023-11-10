
import java.util.Scanner;

class Pythagoras{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sides: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        //Checking which side is greatest
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            c=max;
        }
        System.out.print("The given sides are of rightangle triange(t/f):");
        // checking the given sides are of rightangle triange or not
        if (max==a) {
            boolean flag = b*b + c*c == a*a;
            System.out.println(flag);
        } else if (max==b) {
            boolean flag = a*a + c*c == b*b;
            System.out.println(flag);
        }else {
            boolean flag = b*b + a*a == c*c;
            System.out.println(flag);
        }
    }
}