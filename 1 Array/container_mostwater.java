import java.util.Scanner;
public class container_mostwater {
    public static int container_mostwater(int a[]){
        int height,distance,curarea;
        int maxarea=0;
        int l=0;
        int r=a.length-1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                // Calculate area between line i and line j
                int width = j - i;
                height = Math.min(a[i], a[j]);
                int curArea = width * height;
                
                // Update the maximum area
                maxarea = Math.max(maxarea, curArea);
            }
        }
        
        // Two Pointer Approach :
        // while (l<r) {
        //     height=Math.min(a[r],a[l]);
        //     distance=r-l;
        //     curarea=height*distance;
        //     maxarea=Math.max(maxarea,curarea);
        //     if (a[r]>a[l]){
        //         l++;
        //     }
        //     else{
        //         r--;
        //     }
        // }
        return maxarea;
    }
    public static void main(String[] args) {
        int arr[]={2,7,4,1,5,8,6};
        System.out.println(container_mostwater(arr));
    }
}