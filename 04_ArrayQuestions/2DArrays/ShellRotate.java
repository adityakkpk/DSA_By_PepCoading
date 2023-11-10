import java.util.Scanner;

class ShellRotate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Eneter shell to rotate:");
        int s = sc.nextInt();

        System.out.println("Enter rotation:");
        int rotation = sc.nextInt();

        sc.close();
        
        rotateShell(arr, s, rotation);
        display(arr);
    }

    private static void display(int[][] arr) {
        System.out.println("Rotated Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void rotateShell(int[][] arr, int s, int r) {
        int[] oneD = filloneDFromShell(arr, s);
        rotate(oneD, r);
        fillShellFromOneD(arr, s, oneD);
    }

    private static int[] filloneDFromShell(int[][] arr, int s) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-s;
        int maxc = arr[0].length -s;

        int sSize = 2 * ((maxr-minr)+(maxc-minc));
        int[] oneD = new int[sSize]; 

        //lw
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        //bw
        for (int i = maxr, j = minc+1; j <= maxc; j++) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        //rw
        for (int i = maxr-1, j = maxc; i >= minr; i--) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        //tw
        for (int i = minr, j = maxc-1; j >= minc+1; j--) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        return oneD;
    }

    private static void fillShellFromOneD(int[][] arr, int s, int[] oneD) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-s;
        int maxc = arr[0].length -s;

        //lw
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j]=oneD[idx];
            idx++;
        }
        //bw
        for (int i = maxr, j = minc+1; j <= maxc; j++) {
            arr[i][j]=oneD[idx];
            idx++;
        }
        //rw
        for (int i = maxr-1, j = maxc; i >= minr; i--) {
            arr[i][j]=oneD[idx];
            idx++;
        }
        //tw
        for (int i = minr, j = maxc-1; j >= minc+1; j--) {
            arr[i][j]=oneD[idx];
            idx++;
        }
    }

    private static void rotate(int[] oneD, int r) {
        r = r % oneD.length;
        if(r<0){
            r = r+oneD.length;
        }

        reverse(oneD, 0, oneD.length-1 - r);
        reverse(oneD, oneD.length-r, oneD.length-1);
        reverse(oneD, 0, oneD.length-1);
    }

    private static void reverse(int[] oneD, int li, int ri) {
        while(li<ri){
            int temp = oneD[li];
            oneD[li] = oneD[ri];
            oneD[ri] = temp;

            li++;
            ri--;
        }
    }

}