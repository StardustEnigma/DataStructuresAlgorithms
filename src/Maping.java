import java.util.HashMap;

public class Maping {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,23,4,35,6,4};
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        System.out.println(mpp.getOrDefault(4,0));
    }
}
