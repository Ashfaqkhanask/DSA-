import java.util.Arrays;

public class threeSum {
    public static void main(String[] args) {
        int[] a={2,1,4,3,1,5};
        int target=7;
        int sum=0;
        Arrays.sort(a);
        int l=0;
        int r=a.length-1;
        while (l<r) {
            sum+=a[l]+a[r];
            for (int i = l+1; i < r; i++) {
                sum+=a[i];
                if (sum==target) {
                    System.out.println(a[l]+" "+a[i]+" "+a[r]);
                    break;
                }
            }
            if (sum==target) {
                System.out.println("three sum found");
                break;
            }
        }
    }
}
