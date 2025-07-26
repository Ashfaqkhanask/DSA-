import java.util.Arrays;
// import java.util.HashMap;
public class twoSum {
    public static void main(String[] args) {
        int[] a={4,7,2,8,5,2,1};//1,2,2,4,5,7,8
        int target=10;
        int l=0;
        int r=a.length-1;
        int sum=0;
        Arrays.sort(a);
        while (r>=l) {
            sum=a[l]+a[r];
            if (sum==target) {
                System.out.println("2Sum Found : "+a[l]+" "+a[r]);
                break;
            }
            if (sum>target) {
                r--;
                sum=0;
            }
            if (sum<target) {
                l++;
                sum=0;
            }
        }




        // int res;
        // HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        // for (int i = 0; i < a.length; i++) {
        //     res=target-a[i];
        //     if (hash.containsValue(res)) {
        //         System.out.println("Two Sum Found : "+res+","+a[i]);
        //         break;
        //     }
        //     hash.put(i,a[i]);
        // }
    }
}
