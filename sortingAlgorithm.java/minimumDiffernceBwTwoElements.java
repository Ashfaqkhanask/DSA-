import java.util.Arrays;

public class minimumDiffernceBwTwoElements {
    public static void main(String[] args) {
        int a[]={6,18,1,9,15,14};
        System.out.println(minDifference(a));
    }
    public static int minDifference(int[] a){
        int d=Integer.MAX_VALUE;
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if ((a[i]-a[i-1])<d) {
                d=a[i]-a[i-1];
            }
        }
        return d;
    }
}
