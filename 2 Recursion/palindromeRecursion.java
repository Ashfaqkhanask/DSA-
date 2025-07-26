public class palindromeRecursion {
    //   method not working

    public static double palindrome(int n){
        int length = String.valueOf(n).length();
        length--;
        if(n==0){
            return 0;
        }
        double s=(n%10)*Math.pow(10,length)+palindrome((int) n/10);//n
        // int original=n;  
        // System.out.println(original);     
        int N=(int) s;
        return N;
        // if(n==s){
        //     System.out.println("It's a Palindrome");
        // }
        // else{
        //     System.out.println("not a palindrome");
        // }
        // return s;
    }
    public static void main(String[] args) {
        int n=1432;
        
        // System.out.println(n);
        System.out.println(palindrome(n));
    }
    public static final int original = 100;
}