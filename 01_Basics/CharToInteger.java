
public class CharToInteger {
    public static void main(String[] args) {
        char c = '5';// you can write it char c = 53; because ascii of char '5' is 53 in int.

        // For converting a integer character to an integer just subtract 48 or '0' from charecter.
        int x = c - 48;// Ascii of  '5' = 53 , Ascii of '0' is 48.
        System.out.println(x);
    }
}
