public class bubbleSort {
    public static void main(String[] args) {
        int[] a={9,5,2,6,3,1,3};
        bubble(a);
        for (int i : a) {
            System.out.print(" "+i);
        }
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    // in this we move the biggest element to the last by swapping.
    public static void bubble(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            // boolean isSwapped=false;
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]) {
                    swap(a,j,j+1);
                }
            }
            // if already sorted to minimize time
            // if (!isSwapped) {
            //     break;
            // }
        }
    }
}
