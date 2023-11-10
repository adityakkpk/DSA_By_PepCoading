
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a ={1, 2, 3, 4, 5};
        int[] b ={6, 7, 8, 9 ,10};
        int al = a.length;
        int bl = b.length;
        int[] c = new int[al+bl];
// Method 1
        // for (int i = 0; i < al; i++) {
        //     c[i]=a[i];
        // }
        // for (int i = 0; i < bl; i++) {
        //     c[al+i]=b[i];
        // }

        // System.out.println(Arrays.toString(c));

//Method 2
        System.arraycopy(a, 0, c, 0, al);
        System.arraycopy(b, 0, c, al, bl);

        System.out.println(Arrays.toString(c));
    }
}
