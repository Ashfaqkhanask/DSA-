public class twoNonRepeatingElement {
    public static void main(String[] args) {
        int a[]={1,2,3,4,2,1,7,4};
        System.out.println(nonRepeatingElement(a));
    }
    public static int nonRepeatingElement(int[] a){
        int ans=0;
        int n1=0;
        int n2=0;
        for (int i : a) {
            ans^=i;
        }
        int mask =ans&~(ans-1);
        for (int i : a) {
            if ((i&mask)==0) {
                n1^=i;
            }
        }
        n2=ans^n1;
        System.out.println(n1+" "+n2);
        return 0;
    }

}
