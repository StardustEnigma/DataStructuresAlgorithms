import java.util.Arrays;

public class RotateByKRight {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        rightRotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rightRotate(int[] arr,int k){
        reverse(arr, arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,0,arr.length-1);

    }
    public static void reverse(int[] arr,int i,int j){
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
