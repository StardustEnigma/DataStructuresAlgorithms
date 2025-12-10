import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};
        Set<Integer> set =new LinkedHashSet<>();
        for (int num :arr1){
            set.add(num);
        }

        for (int num:arr2){
            set.add(num);
        }

        int[] uniqueArr=new int[set.size()];
        int index=0;
        for(int val:set){
            uniqueArr[index++]=val;
        }
        System.out.println(Arrays.toString(uniqueArr));
    }
}
