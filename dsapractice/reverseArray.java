public class reverseArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int l=0;
        int r=a.length-1;
        while (l<=r) {
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
