public class insertionSort {
    public static void main(String[] args) {
        int[] a = {9, 5, 2, 6, 3, 1, 3};
        insertion(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
// in this we divide the array as sorted:Unsorted 
    public static void insertion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            // Insert key at the correct position
            a[j + 1] = key;
        }
    }
}
