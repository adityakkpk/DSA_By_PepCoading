
public class Q168 {
    public static void main(String[] args) {
        int cn = 28;
        System.out.println(convertToTitle(cn));
    }
    public static String convertToTitle(int columnNumber) {
        String rv ="";
        while(columnNumber>0){
            if(columnNumber==26){
                rv = rv+(char)(64+26);
                columnNumber = columnNumber/26;
            }else if(columnNumber<26){
                int rem = columnNumber%26;
                columnNumber = columnNumber/26;
                rv = rv+(char)(64+rem);
            }else{
                int rem = columnNumber%26;
                columnNumber = columnNumber/26;
                rv = rv+(char)(64+rem);
            }
        }
        String rv1= "";
        char ch;
        for (int i=0; i<rv.length(); i++)
        {
            ch= rv.charAt(i); //extracts each character
            rv1= ch+rv1; //adds each character in front of the existing string
        }
        return rv1;
    }
}