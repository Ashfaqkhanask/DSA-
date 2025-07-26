public class powerOfNumber {
    public static int pow(int n,int p){
        if(n==1){
            return 1;
        }
        if(p==0){
            return 1;
        }
        return n*pow(n,p-1);
    }
    public static void main(String[] args) {
        int p=6;
        int n=1;
        System.out.println(pow(n,p));
    }
}
