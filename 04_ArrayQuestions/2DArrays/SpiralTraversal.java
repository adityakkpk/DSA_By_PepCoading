import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();

        //Spiral Traversal
        System.out.println("Spiral Traversal: ");
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int count = 0;
        int totalEle = r1*c1;

        while(count < totalEle){
            //Left wall
            for (int i = minr, j = minc; i <= maxr && count<totalEle; i++) {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minc++;

            //bottom wall
            for (int i = maxr, j = minc; j <= maxc && count<totalEle; j++) {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxr--;

            //right wall
            for (int i = maxr, j = maxc; i >=minr && count<totalEle; i--) {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxc--;

            //top wall
            for (int i = minr, j = maxc; j>=minc && count<totalEle; j--) {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minr++;
            
        }
    }
}
