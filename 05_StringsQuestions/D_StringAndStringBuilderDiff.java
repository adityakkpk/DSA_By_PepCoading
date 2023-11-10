
public class D_StringAndStringBuilderDiff {
    public static void main(String[] args) {

        int n = 1000;


        String s = "";
        long startS  = System.currentTimeMillis();
        for (char i = 0; i < n; i++) {
            s = s+ i;
        }
        long endS  = System.currentTimeMillis();
        long durationS = endS -startS;
        System.out.println("String: "+durationS);



        StringBuilder sb = new StringBuilder("");
        long startSB  = System.currentTimeMillis();
        for (char i = 0; i < n; i++) {
            sb.append(i);
        }
        long endSB  = System.currentTimeMillis();
        long durationSB = endSB -startSB;
        System.out.println("StringBuilder: "+durationSB);
    }
}
