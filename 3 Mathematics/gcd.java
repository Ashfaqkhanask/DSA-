public class gcd{
    // NOTE : There is a concept to find gcd in mathematics lecture 1 
    //       return gcd(a,a-b) and some if coditions
    //   a>b return gcd(a-b,b)
    public static int GCD(int a,int b){
        if(a%b==0){
            return b;
        }
        return GCD(b,a%b);
    }
    public static void main(String[] args) {
        int a=18;
        int b=17;
        System.out.print("The GCD Of "+a+" and "+b+" : ");
        System.out.println(GCD(a,b));
    }
}