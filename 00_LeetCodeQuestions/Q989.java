import java.util.ArrayList;
import java.util.List;

public class Q989 {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        StringBuilder sb = new StringBuilder("");
        for(int i: num){
            sb.append(i);
        }
        long n = Long.parseLong(sb.toString());
        long res = n + k;
        String s = Long.toString(res);
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            li.add(s.charAt(i)-48);
        }
        System.out.println(li);
    }
}
