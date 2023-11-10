public class I_PrintArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArrayReverse(arr, arr.length-1);
    }
    public static void printArrayReverse(int[] arr, int idx){
        if(idx<0){
            return;
        }

        System.out.println(arr[idx]);
        printArrayReverse(arr, idx-1);
        
        
    }
}
