public class Sum {
//    public static void main(String[] args) {
//      int i=5;
//      int add=0;
//      sum(i,add);
//    }
//    public static void sum(int i,int add){
//     if(i<0){
//         System.out.println(add);
//         return;
//     }
//     sum(i-1,add+i);
//    }
public static void main(String[] args) {
    int n=5;
    int add=sum(n);
    System.out.println((add));

}
static int sum(int n){
    if (n==0){
        return 0;
    }
    return n+sum(n-1);
}
}
