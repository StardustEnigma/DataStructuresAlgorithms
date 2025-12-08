public class SortedArray {
    public static void main(String[] args) {
        int []arr={3,4,5,1,2};
        boolean Sorted=true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] >arr[i+1]) {
               Sorted=false;
               break;
            }

        }
        if (Sorted){
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
