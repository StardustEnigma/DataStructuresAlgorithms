public class MaxProfitStock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int min=arr[0];
        int profit=0;
        int cost=0;
        for (int i = 0; i < arr.length; i++) {
            cost=arr[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(arr[i],min);

        }
        System.out.println(profit);
    }
}
