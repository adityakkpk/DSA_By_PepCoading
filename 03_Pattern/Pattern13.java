//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of rows:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {// n=i
            int icj = 1; // nc0=1
            for (int j = 0; j <= i; j++) {
                System.out.print(icj+"\t");
                // formula for nc0+1
                int icjp1= (icj*(i-j))/(j+1);
                icj = icjp1;
            }
            System.out.println();
        }
        sc.close();
    }
}
