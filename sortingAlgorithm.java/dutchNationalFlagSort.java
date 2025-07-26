public class dutchNationalFlagSort {
    public static void main(String[] args) {
        int[] a = {2, 0, 2, 1, 1, 0};
        dutchSort(a);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void dutchSort(int[] a) {
        int low = 0, mid = 0;
        int high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {////////////   we can also use if-else instead of switch-case
                case 0:
                    // Swap a[low] and a[mid], increment low and mid
                    int temp0 = a[low];
                    a[low] = a[mid];
                    a[mid] = temp0;
                    low++;
                    mid++;
                    break;// to get out of switch case to while loop
                    //the break here only exits the switch-case block, not the while loop.
                case 1:
                    // Leave it, just move mid
                    mid++;
                    break;
                case 2:
                    // Swap a[mid] and a[high], decrement high
                    int temp2 = a[mid];
                    a[mid] = a[high];
                    a[high] = temp2;
                    high--;
                    break;
            }
        }
    }
}
// public class ThreeTypeSort {
//     public static void main(String[] args) {
//         int[] a = {2, 0, 2, 1, 1, 0};
//         countSort(a);
//         for (int num : a) {
//             System.out.print(num + " ");
//         }
//     }

//     public static void countSort(int[] a) {
//         int count0 = 0, count1 = 0, count2 = 0;

//         // Count frequency
//         for (int i : a) {
//             if (i == 0) count0++;
//             else if (i == 1) count1++;
//             else count2++;
//         }

//         // Reconstruct array
//         int i = 0;
//         while (count0-- > 0) a[i++] = 0;
//         while (count1-- > 0) a[i++] = 1;
//         while (count2-- > 0) a[i++] = 2;
//     }
// }
