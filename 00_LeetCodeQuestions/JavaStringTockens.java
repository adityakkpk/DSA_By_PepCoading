
import java.util.Objects;

public class JavaStringTockens {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        String a = s.replaceAll("[^a-zA-Z0-9]+", " ").trim();
        // Write your code here.
        String [] arr = a.split(" ");
        if(Objects.equals(arr[0], "")){
            System.out.println(0);
        }
        else{
            System.out.println(arr.length);
        }
        for (String string : arr) System.out.println(string);
    }
}
