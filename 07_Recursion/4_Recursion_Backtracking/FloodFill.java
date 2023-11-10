import java.util.Scanner;

class FloodFill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column of maze:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter arry elements:");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m]; 
        floodFill(arr,0,0,"",visited);
        sc.close();
    }

    private static void floodFill(int[][] arr, int row, int col, String ans, boolean[][] visited) {
        //smart base case
        if(row < 0 || col < 0 || row == arr.length || col == arr.length || arr[row][col] == 1 || visited[row][col]==true){
            return;
        }
        if(row == arr.length-1 && col == arr.length-1){
            System.out.println(ans);
            return;
        }

        //calls
        visited[row][col] = true;
        floodFill(arr, row-1, col, ans+"t", visited);
        floodFill(arr, row, col-1, ans+"l", visited);
        floodFill(arr, row+1, col, ans+"d", visited);
        floodFill(arr, row, col+1, ans+"r", visited);
        visited[row][col] = false;
    }

}