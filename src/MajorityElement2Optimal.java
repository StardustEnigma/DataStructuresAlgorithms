import java.util.ArrayList;
import java.util.List;

public class MajorityElement2Optimal {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,3,2,2,2};
        int cnt1=0;
        int cnt2=0;
        int elem1=0;
        int elem2=0;

        for (int i=0;i< arr.length;i++){
            if (cnt1==0 && arr[i] !=elem2){
                cnt1=1;
                elem1=arr[i];
            } else if (cnt2==0 && arr[i] != elem1) {
                cnt2=1;
                elem2=arr[i];
            } else if (elem1==arr[i]) {
                cnt1++;
            } else if (elem2==arr[i]) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }

        }
        cnt1 = 0;
        cnt2 = 0;

        for (int num : arr) {
            if (num == elem1) cnt1++;
            else if (num == elem2) cnt2++;
        }

        List<Integer> ans = new ArrayList<>();
        int n = arr.length;

        if (cnt1 > n / 3) ans.add(elem1);
        if (cnt2 > n / 3) ans.add(elem2);

        System.out.println(ans);
    }
}
