public class unionOfTwoSortedArray {// 2nd method will run for all cases.
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 6, 7, 7, 8, 9};
        int[] b = {1, 1, 2, 3, 4, 7, 8, 8, 10};
        union(a, b);
    }

    public static void union(int[] a, int[] b) {
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            // Skip duplicates in a[]
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            // Skip duplicates in b[]
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                // both are equal, print only once
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }

        // Remaining elements in a[]
        while (i < a.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            System.out.print(a[i] + " ");
            i++;
        }

        // Remaining elements in b[]
        while (j < b.length) {
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            System.out.print(b[j] + " ");
            j++;
        }
    }
}

// public class unionOfTwoSortedArray {
//     public static void main(String[] args) {
//         int[] a = {2, 5, 6, 6, 7, 7, 8, 9};
//         int[] b = {1, 1, 2, 3, 4, 7, 8, 8, 10};
//         union(a, b);
//     }

//     public static void union(int[] a, int[] b) {
//         int i = 0, j = 0;
//         int lastPrinted = Integer.MIN_VALUE;

//         while (i < a.length && j < b.length) {
//             // Skip duplicates within a[]
//             while (i < a.length && a[i] == lastPrinted) i++;
//             // Skip duplicates within b[]
//             while (j < b.length && b[j] == lastPrinted) j++;

//             if (i >= a.length || j >= b.length) break;

//             if (a[i] < b[j]) {
//                 System.out.print(a[i] + " ");
//                 lastPrinted = a[i];
//                 i++;
//             } else if (a[i] > b[j]) {
//                 System.out.print(b[j] + " ");
//                 lastPrinted = b[j];
//                 j++;
//             } else {
//                 System.out.print(a[i] + " ");
//                 lastPrinted = a[i];
//                 i++;
//                 j++;
//             }
//         }

//         // Print remaining elements in a[]
//         while (i < a.length) {
//             if (a[i] != lastPrinted) {
//                 System.out.print(a[i] + " ");
//                 lastPrinted = a[i];
//             }
//             i++;
//         }

//         // Print remaining elements in b[]
//         while (j < b.length) {
//             if (b[j] != lastPrinted) {
//                 System.out.print(b[j] + " ");
//                 lastPrinted = b[j];
//             }
//             j++;
//         }
//     }
// }
