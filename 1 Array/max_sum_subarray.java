import java.util.Scanner;

public class max_sum_subarray {
    public static int max_sum_subarray(int arr[]) {// { -3, 1, -2, 5, -6, -2, 1, -3 };
        //                  Approach (Kadane's Algorithm):
                            //          METHOD 1

        // int maxSoFar = arr[0];   // Initialize to the first element
        // int currentMax = arr[0]; // Also initialize currentMax to the first element

        // // Traverse the array from the second element
        // for (int i = 1; i < arr.length; i++) {
        //     // Update currentMax to be the maximum of current element or currentMax + current element
        //     currentMax = Math.max(arr[i], currentMax + arr[i]);

        //     // Update maxSoFar to be the maximum of maxSoFar or currentMax
        //     maxSoFar = Math.max(maxSoFar, currentMax);
        // }
        //                              METHOD 2
        
        int max = Integer.MIN_VALUE;
        int cmax = 0;
        int s=0;
        int e=0;
        int temps=0;
        // anuj bhaiya method
        for (int i = 0; i < arr.length; i++) {
            cmax += arr[i];
            if (cmax > max) {
                s=temps;
                e=i;
                max = cmax;
            }
            if (cmax < 0) {
                cmax = 0;
                temps=i+1;
            }
            System.out.println("cmax is "+cmax+" "+temps);
        }
        System.out.print("The Elemenet of Maximum Subarray : ");
        for(int i=s;i<=e;i++){
            System.out.print(arr[i]+" ");
        }
                                    //          METHOD 3
        // for (int i = 0; i < arr.length; i++) {
        //     cmax = arr[i];
        //     if (cmax > max) {
        //         max = cmax;
        //     }
        //     for (int j = i + 1; j < arr.length; j++) {
        //         cmax += arr[j];
        //         if (cmax > max) {
        //             max = cmax;
        //         }
        //     }
        // }
        System.out.println("\n"+max);

        return 0;
    }

    public static void main(String[] args) {
        int a[] = { -3, 1, -2, 5, 6, -2, 11, -3 };
        System.out.println(max_sum_subarray(a));
    }
}