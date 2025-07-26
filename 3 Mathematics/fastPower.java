public class fastPower {
    public static void main(String[] args) {
    int a=4;
    int b=5;
    System.out.println(fastPow(a, b));//Time Complexity=log(n)
    }
    static int fastPow(int a,int b){
        if (b==0) {
            return 1;
        }
        int halfRes=fastPow(a, b/2);//Recursive Statement
        int fullRes=halfRes*halfRes;
        if (b%2!=0) {
            fullRes=fullRes*a;
        }
        return fullRes;
    }
}
