// 1. Boyer-Moore Voting Algorithm (REVISE IT)
// 2. Hash Map Approach
// 3. Sorting Approach

import java.util.HashMap;
public class MajorityElement {
    public static int majorityElement(int[] a){
        HashMap<Integer,Integer> countMap=new HashMap<>();//hashMap works like a dictionary in python
        int n=a.length;
        for (int i : a) {
            countMap.put(i, countMap.getOrDefault(i, 0)+1);// putting key and counting value simultaneously
            if(countMap.get(i)>n/2){
                System.out.println("Majority Element is : "+i);
                return i;
            }
        }
        return 0;

                    // Method to find the majority element using Boyer-Moore Voting Algorithm

    // public static int majorityElement(int[] nums) {
    //     int candidate = nums[0];
    //     int count = 1;

    //     // Step 1: Find the candidate
    //     for (int i = 1; i < nums.length; i++) {
    //         if (count == 0) {
    //             candidate = nums[i];
    //             count = 1;
    //         } else if (nums[i] == candidate) {
    //             count++;
    //         } else {
    //             count--;
    //         }
    //     }

    //     // Step 2: Verify the candidate (optional if guaranteed)
    //     count = 0;
    //     for (int num : nums) {
    //         if (num == candidate) {
    //             count++;
    //         }
    //     }
    //     if (count > nums.length / 2) {
    //         return candidate;
    //     } else {
    //         throw new IllegalArgumentException("No majority element found");
    //     }
    // }

    }
    public static void main(String[] args) {
        int a[]={1,2,1,2,1,2,2,3,3,3,3,3,3,3,3,3,3};
        majorityElement(a);
    }
}
