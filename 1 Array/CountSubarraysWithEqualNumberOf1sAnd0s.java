// Summary : Count subarrays with equal number of 1’s and 0’s are : "

//          Brute-Force Approach:
// Time Complexity: O(n^3) due to three nested loops: one for the starting index, one for the ending index, and one for summing the elements.
// Space Complexity: O(1)

//          Prefix Sum with HashMap:
// Time Complexity: O(n)
// Space Complexity: O(n)

//          Prefix Sum with Two-Pointer Technique:
// Time Complexity: O(n^2) due to nested loops for counting subarrays based on prefix sums.
// Space Complexity: O(n)

public class CountSubarraysWithEqualNumberOf1sAnd0s {
    public static void main(String[] args) {
        int a[]={1,0,0,1,0,1,1};
        System.out.println(CountSubarraysWithEqual0s1s(a));
    }
    public static int CountSubarraysWithEqual0s1s(int [] a){
        int count=0;
        int n=a.length;
        //          Prefix Sum with Two-Pointer Technique:
        for (int i = 0; i < n; i++) {
            a[i] = (a[i] == 0) ? -1 : a[i];
        }

        // Calculate prefix sums
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + a[i];
        }

        // Count subarrays with equal number of 1s and 0s
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (prefixSum[j + 1] - prefixSum[i] == 0) {
                    count++;
                }
            }
        }
        //          Brute-Force Approach: (According To Me My Method Is Brute Force)

        int count1=0;
        int count0=0;
        int largestSubarray=0;;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){//a[]={1,0,0,1,0,1,1};
                if (a[j]==1) {
                    count1++;
                }
                else{
                    count0++;
                }
                if(count1==count0){
                    count+=1;
                    System.out.println("INDEX : ("+i+","+j+")");
                    largestSubarray=Math.max(j-i+1, largestSubarray);
                }
            }
            count0=0;
            count1=0;
        }
        System.out.println("the length of largest subarray with equal no. of 0's & 1's is : "+largestSubarray);
        System.out.print("No. of subarrays with equal number of 1’s and 0’s are : ");
        return count;
    }
}
