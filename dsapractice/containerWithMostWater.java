public class containerWithMostWater{
    public static void main(String[] args) {
        int a[]={1,8,6,2,5,4,8,3,7};
        int max=0;
        int curmax=0;
        int l=0;
        int r=a.length-1;
        while (l<=r) {
            max=(r-l)*Math.min(a[r],a[l]);
            curmax=Math.max(curmax, max);
            if (a[l]>a[r]) {
                r--;
            }
            else{
                l++;
            }
        }
        System.out.println(curmax);
    }
}