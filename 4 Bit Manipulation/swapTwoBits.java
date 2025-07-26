public class swapTwoBits {
    public static void main(String[] args) {
        int n=64;
        int i=1;
        int j=1;
        System.out.println(swap(n,i,j));
    }
    public static int swap(int n,int i,int j){
        i<<=1;
        n=n^i;
        j<<=5;
        n=n^j;
        return n;
    }
}