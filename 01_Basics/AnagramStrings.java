
import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String s = "anagramm";
        String t = "marganaa";
        String u = "bcd";

        boolean val=checkAnagram(s, t);
        System.out.println("String "+s+" and String "+t+" are Anagrams: "+val);
        val =checkAnagram(s, u);
        System.out.println("String "+s+" and String "+u+" are Anagrams: "+val);

    }
    public static boolean checkAnagram(String a, String b){
        boolean val;
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] arr1 = a.toCharArray(); 
        char[] arr2 = b.toCharArray(); 

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            val = true;
        }else{
            val = false;
        }

        return val;
    }
}
