public class arrayPalindromeOrNot {
    public static void main(String[] args) {
        int a[]={2,5,5,2};
        int n=a.length-1;
        int i=0;
        System.out.println(checkPalindrome(a,n,i));
        // boolean chk=checkPalindrome(a,n,i);
    }
    public static boolean checkPalindrome(int a[],int n,int i){
        if (i>=n) {
            return true;
        }
        if (a[i]!=a[n]) {
            return false;
        }
        else{
            i+=1;
            n-=1;
            return checkPalindrome(a, n, i);
        }
    }
}
