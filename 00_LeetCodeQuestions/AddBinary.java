public class AddBinary {
    public static void main(String[] args) {
        String a ="1110110101";
        
        String b ="1110111011";
        StringBuilder res = new StringBuilder("");
        int n1 = a.length()-1;
        int n2 = b.length()-1;
        int carry = 0;
        while(n1 >= 0 || n2 >= 0){
            int sum = carry;
            if(n1 >= 0){
                if(a.charAt(n1) == '1') sum++;
                n1--;
            }
            if(n2 >= 0){
                if(b.charAt(n2) == '1') sum++;
                n2--;
            }
            if(sum == 3){
                res.append("1");
                carry = 1;
            } else if(sum == 2){
                res.append("0");
                carry = 1;
            } else if(sum == 1){
                res.append("1");
                carry = 0;
            } else {
                res.append("0");
            }
        }
        if(carry == 1) res.append("1");
        System.out.println( res.reverse().toString());
    }
}
