//array reversal
public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int n=arr.length;
        int i=0;
        reverse(i,arr,n);
        for (int j = 0; j < n; j++) {
            System.out.print(" "+arr[j]);
        }
    }
    public static void reverse(int i,int arr[],int n){
        if (i>=n/2){
            return;
        }
        swap(arr,i,n-i-1);
        reverse(i+1,arr,n);
    }

    private static void swap(int arr[],int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
