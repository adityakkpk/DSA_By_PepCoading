import java.util.Scanner;

public class ExitPointOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        
        //Exit point of Matrix
        int dir = 0; //0->East, 1->South, 2->West, 3->North
        int i = 0;
        int j = 0;

        while (true) {

            dir = (dir + arr[i][j])% 4;
            if(dir==0){
                j++;
            }else if(dir==1){
                i++;
            }else if(dir==2){
                j--;
            }else if(dir==3){
                i--;
            }

            if(i<0){
                i++;
                break;
            }else if(i==arr.length){
                i--;
                break;
            }else if(j<0){
                j++;
                break;
            }else if(j==arr[0].length){
                j--;
                break;
            }
        }
        System.out.println("i: "+i);
        System.out.println("j: "+j);
    }
}
