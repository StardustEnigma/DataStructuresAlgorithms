import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1;j<arr[i].length;j++){
                swap(arr,i,j,j,i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
                int left=0;
                int right= arr[i].length-1;

                while (left<=right){
                    swap(arr,i,left,i,right);
                    left++;
                    right--;
                }
        }
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    static void swap(int[][] arr, int r1, int c1, int r2, int c2) {
        int temp = arr[r1][c1];
        arr[r1][c1] = arr[r2][c2];
        arr[r2][c2] = temp;
    }

}
