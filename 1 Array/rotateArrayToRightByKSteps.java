
// 1.   Reverse Approach:
// Time Complexity: O(n)
// Space Complexity: O(1) (in-place)

// 2.   Extra Array Approach:
// Time Complexity: O(n)
// Space Complexity: O(n) (additional array required)

// 3.   In-Place Approach (Juggling Algorithm):         NOTE : ""LEARN JUGGLING METHOD""
// Time Complexity: O(n)
// Space Complexity: O(1) (in-place)
// import java.util.Scanner;
public class rotateArrayToRightByKSteps {
    public static void reverse(int a[],int start,int end){
        while (start<end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }

        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void rotate(int a[],int k){
        k=k%a.length;
        int start=0;
        int end=0;
        System.out.println();
        System.out.println("REVERSING WHOLE ARRAY ");
        reverse(a,0,a.length-1);
        System.out.println("REVERSE LEFT PART OF ARRAY");
        reverse(a, 0, k-1);

        System.out.println("REVERSE RIGHTT PART OF ARRAY");
        reverse(a, k, a.length-1);
    }
    public static void printArray(int[] a){
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=16;
        System.out.println("ORIGINAL ARRAY ");
        printArray(a);
        rotate(a,k);
        // System.out.println();
        // printArray(a);
    }
}
