import java.util.Scanner;

public class SearchInSorted2DMatrix {
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
        System.out.println("Enter number to serarch:");
        int x = sc.nextInt();
        sc.close();

        findX(arr, x);
    }

    public static void findX(int[][] arr, int x) {
        int i = 0;
        int j = arr[0].length -1;

        while (i< arr.length && j>=0) {
            if(x == arr[i][j]){
                System.out.println("Found at:"+i+" "+j);
                return;
            }else if(x < arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not Found.");
    }
}
