import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MajorityElement2Better {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        int[] arr={1,1,1,1,3,2,2,2};
        for (int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for (int key : map.keySet()){
            if (map.get(key)> arr.length/3){
                ans.add(key);
            }
        }
        System.out.println(ans);
    }
}
