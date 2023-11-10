import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String x = a.toLowerCase();
        String y = b.toLowerCase();
        char[] arr1 = x.toCharArray();
        char[] arr2 = y.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            return true;
        }else{
            return false;
        }
    }
}
