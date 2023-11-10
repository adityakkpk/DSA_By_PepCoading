

import java.util.Scanner;

class MyRegex{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegexD().pattern));
        }
        in.close();
    }
}

//Write your code here
class MyRegexD {

    String pattern;

    MyRegexD() {
        int n = 4;
        StringBuilder sb = new StringBuilder();
        String prefix = "^";
        String range = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})";
        String delimiter = "\\.";
        String suffix = "$";

        sb.append(prefix);
        for (int i = 0; i < n; i++) {
            sb.append(range);
            if (i < n - 1) sb.append(delimiter);
            else sb.append(suffix);
        }
        this.pattern = sb.toString();
    }
}
