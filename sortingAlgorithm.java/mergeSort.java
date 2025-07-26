public class mergeSort {
    public static void main(String[] args) {
        int[] a={9, 7, 6, 4, 2, 1, 4, 3};
        int l=0;
        int h=a.length-1;
        sortMerge(a,l,h);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    public static void sortMerge(int a[],int l,int h ){
        if (l<h) {
            int mid=(l+h)/2;
            sortMerge(a, l,mid);
            sortMerge(a, mid+1, h);
            merge(a,l,mid,h);
        }

    }
    public static void merge(int[] a,int l,int mid,int h){
        int[] b=new int[a.length];
        int i=l;
        int j=mid+1;
        int k=l;
        while (i<=mid && j<=h) {
            if (a[i]<=a[j]) {
                b[k]=a[i];
                i++;
            }else{
                b[k]=a[j];
                j++;
            }
            k++;
        }//{9, 7, 6, 4, 2, 1, 4, 3}={4,6,7,9 : 1,2,3,4}
        if (i>mid) {
            while (j<=h) {
                b[k]=a[j];
                k++;j++;
            }
        }else{
            while (i<=mid) {
                b[k]=a[i];
                k++;i++;
            }
        }
        for (i = l; i <= h; i++) {
            a[i]=b[i];
        }
    }
}
