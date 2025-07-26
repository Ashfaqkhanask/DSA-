import java.util.*;

public class splitArrayIn3EqualSumSubArrays {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 5, -2, 2, 5, 0, -9, 4 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println(equalSumSubArray(arr));
    }

    public static boolean equalSumSubArray(int a[]) {
        int n = a.length;
        int targetsum = 0;
        for (int i = 0; i < n; i++) {
            targetsum += a[i];
        }
        System.out.println("total sum is " + targetsum);
        if (targetsum % 3 != 0) {
            return false;
        }
        targetsum = targetsum / 3;
        System.out.println("Sum of each subarrays : " + targetsum);
        int currentsum = 0;
        int count = 0;
        int r = 0;
        for (int i = 0; i < n; i++) {// arr = {0,2,1,-6,6,-7,9,1,2,0,1}; 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
            if (count == 2) {
                System.out.print("("+a[i]+") +");
                continue;
            }
            currentsum += a[i];
            System.out.print("(" + a[i] + ")" + "+");
            if (currentsum == targetsum) {
                currentsum = 0;
                System.out.print(" = ");
                count++;
            }
        }
        return true;
    }
}
// int prefix[]=new int[n];
// prefix[0]=a[0];

// for (int i : prefix) {
// System.out.print(i+" ");
// }