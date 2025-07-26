public class MaximumDifferenceBetweenIncreasingElements {
    public static int MaxDifference(int a[]){
        int maxDifference=a[a.length-1]-a[0];
        int l=0;
        int r=a.length-1;
        while (l<r) {
            maxDifference=Math.max(maxDifference, a[r]-a[l]);
            if (a[l]>a[r]) {
                l++;
            }
            else{
                r--;
            }
        }
        return maxDifference;
    }
    public static void main(String[] args) {
        // int a[]={7,1,5,4};
        int a[]={1,5,2,10};
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(MaxDifference(a));
    }
}
