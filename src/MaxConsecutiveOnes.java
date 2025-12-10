public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr= {1,1,0,1,1,1};
        int maxi=0;
        int counter=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==1){
                counter++;
                maxi=Math.max(maxi,counter);
            }
            else {
                counter=0;
            }

        }
        System.out.println(maxi);
    }
}
