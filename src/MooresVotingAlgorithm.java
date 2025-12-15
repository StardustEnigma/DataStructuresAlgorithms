public class MooresVotingAlgorithm {
    public static void main(String[] args) {
        int [] arr={2,2,1,1,1,2,2};

        int count=0;
        int candidate=0;
        for (int i = 0; i < arr.length; i++) {

            if (count==0){
                candidate=arr[i];
            }
            if (arr[i]==candidate){
                count++;
            }
            else {
                count--;
            }
        }
        int freq=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==candidate){
                freq++;
            }
        }
        if (freq>arr.length/2){
            System.out.println(candidate);
        }
    }
}
