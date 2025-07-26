public class findIthBit {
    public static int ithBit(int n,int i){
        int mask=1<<i;
        int result=n&mask;
        if (result==0) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        int n=5;
        // int i=4;
        System.out.println(ithBit(n,4));
    }
}