public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={3,5,67,23,211,45};
        int largest=arr[0];
        int secondLargest=-1;

        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            if (arr[i]!=largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
