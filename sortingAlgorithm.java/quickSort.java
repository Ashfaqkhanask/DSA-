import java.util.Random;

public class quickSort {//quick sort 3 steps : choose pivot, partition+swap, recurrsive calls
    public static void main(String[] args) {
        int[] a = {6,8,1,1,2,1};
        quick(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void quick(int[] a, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        // Choose random pivot and move it to the end
        int pivotIndex = new Random().nextInt(highIndex - lowIndex + 1) + lowIndex;
        int pivot = a[pivotIndex];
        swap(a, pivotIndex, highIndex);

        // Partition the array
        int leftPointer = partition(a, lowIndex, highIndex, pivot);

        // Recursive calls
        quick(a, lowIndex, leftPointer - 1);
        quick(a, leftPointer + 1, highIndex);
    }

    public static int partition(int[] a, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (a[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (a[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(a, leftPointer, rightPointer);
        }

        swap(a, leftPointer, highIndex); // Move pivot to its final place
        return leftPointer;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}


// different approach 

// public class QuickSort {
//     public static void main(String[] args) {
//         int[] a = {6, 3, 9, 1, 4, 2, 7};
//         quickSort(a, 0, a.length - 1);

//         for (int i : a) {
//             System.out.print(i + " ");
//         }
//     }

//     public static void quickSort(int[] a, int low, int high) {
//         if (low < high) {
//             int pivotIndex = partition(a, low, high);
//             quickSort(a, low, pivotIndex - 1);
//             quickSort(a, pivotIndex + 1, high);
//         }
//     }

//     public static int partition(int[] a, int low, int high) {
//         int pivot = a[high]; // choose last element as pivot
//         int i = low - 1;

//         for (int j = low; j < high; j++) {
//             if (a[j] < pivot) {
//                 i++;
//                 // swap a[i] and a[j]
//                 int temp = a[i];
//                 a[i] = a[j];
//                 a[j] = temp;
//             }
//         }

//         // swap a[i+1] and a[high] (pivot to correct position)
//         int temp = a[i + 1];
//         a[i + 1] = a[high];
//         a[high] = temp;

//         return i + 1;
//     }
// }
