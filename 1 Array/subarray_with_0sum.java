//          METHOD : SET (check-PREFIX SUM)
import java.util.Set;
import java.util.HashSet;
public class subarray_with_0sum {
    public static void main(String[] args) {
        int [] a={2,3,1,-4,3,-2};
        System.out.println(zero_sum(a));
    }
    public static boolean zero_sum(int[] a){
        int n=a.length;
        // int [] prefixsum=new int[n];
        int sum=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}