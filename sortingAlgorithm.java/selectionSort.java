public class selectionSort {
    public static void main(String[] args) {
        int[] a={9,5,2,6,3,1,3};
        insertion(a);
        for (int i : a) {
            System.out.print(" "+i);
        }
    }
    // in this we found  minimum element and swap from starting
    public static void insertion(int [] a){
        int min=0;
        for (int i = 0; i < a.length-1; i++) {
            int j=i;
            min=i;
            for (; j < a.length; j++) {
                if (a[j]<a[min]) {
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
}
