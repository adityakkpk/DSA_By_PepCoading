import java.util.Scanner;

class SaddlePoint{
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
        sc.close();

        saddle(arr);
    }

    public static void saddle(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int svj = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if(arr[i][j]<arr[i][svj]){
                    svj = j;
                }
            }

            boolean flag = true;

            for (int j = 0; j < arr.length; j++) {
                if(arr[j][svj] > arr[i][svj]){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("No Saddle Point. :(");
    }
}