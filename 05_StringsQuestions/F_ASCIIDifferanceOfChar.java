
public class F_ASCIIDifferanceOfChar {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);                                                            
            int gap = curr-prev;

            sb.append(gap);
            sb.append(curr);
        }

        return sb.toString();
    }
}
