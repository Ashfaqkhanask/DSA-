public class insertionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 6, 8, 8, 9};
        int[] b = {1, 1, 2, 3, 6, 6, 9};
        intersection(a, b);
    }

    public static void intersection(int[] a, int[] b) {
        int i = 0, j = 0;
        // int lastPrinted = Integer.MIN_VALUE; // To track duplicates in result

        while (i < a.length && j < b.length) {
            if (i>0 && a[i]==a[i-1]) {
                i++;
                continue;
            }
            if (a[i] == b[j]) {
                // if (a[i] != lastPrinted) { // Only print if not already printed
                //     System.out.print(a[i] + " ");
                //     lastPrinted = a[i];
                // }
                System.out.print(a[i]+" ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}
