import java.util.Scanner;

class G_TowerOfHanoi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nubers of disks: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Mehods for transfering disks from tower 1 to tower 2 using tower 3:");
        toh(n, 1, 2, 3);
    }
    public static void toh(int n, int s, int d, int h){
        //Base case
        if(n==0){
            return;
        }

        toh(n-1, s, h, d);
        System.out.println(n+"["+s+" -> "+d+"]");
        toh(n-1, h, d, s);
    }
}