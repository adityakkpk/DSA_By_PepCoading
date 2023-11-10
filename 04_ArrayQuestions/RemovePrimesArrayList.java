
import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimesArrayList {
    public static void solution(ArrayList<Integer> al) {
        for (int i = al.size()-1; i >= 0; i--) {
            int val = al.get(i);
            if(isPrime(val)){
                al.remove(i);
            }
        }
    }

    private static boolean isPrime(int val) {
        for (int i = 2; i*i <= val; i++) {
            if(val%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array elements;");
        for (int i = 0; i < 10; i++) {
            al.add(sc.nextInt());
        }
        sc.close();
        solution(al);
        System.out.println(al);
    }
}
