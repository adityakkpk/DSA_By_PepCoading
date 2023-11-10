
import java.util.Scanner;

public class BenjaminBulb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of bulbs: ");
        int n = in.nextInt();
        System.out.println("Bulbs which remain on:");
        for (int i = 1; i*i <=n; i++) {
            System.out.println(i*i);
        }
        in.close();
    }
}
