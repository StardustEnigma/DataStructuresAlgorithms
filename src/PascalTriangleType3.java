import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangleType3 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle= new ArrayList<>();
        for (int i = 1; i <=numRows ; i++) {
            triangle.add(generateRow(i));
        }
        return triangle;
    }
    public static List<Integer> generateRow(int row){
        int n=row-1;
        int ans=1;
        List<Integer> fullRow=new ArrayList<>();
        fullRow.add(ans);
        for (int i = 1; i <=n ; i++) {
            ans=ans*(n-i+1);
            ans=ans/i;
            fullRow.add(ans);
        }
        return fullRow;
    }
}
