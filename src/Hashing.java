public class Hashing {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,5,3,2,2,2};
        int[] hash=new int[13];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int number =2;
        System.out.println(hash[number]);
        System.out.println(hash[12]);
    }
}
