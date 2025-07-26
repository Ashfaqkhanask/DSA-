import java.util.*;

public class uniquePermutationOfANumber {
    // This method takes the array of numbers as input and returns a list of lists of integers (unique permutations).
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();  // This will store the final result (list of unique permutations).
        List<Integer> current = new ArrayList<>();  // This is used to build each permutation step by step.
        
        Arrays.sort(nums);  // Sorting the array helps in handling duplicates efficiently. After sorting, duplicates will be adjacent.
        
        boolean[] used = new boolean[nums.length];  // This boolean array keeps track of which elements have already been used in the current permutation.
        // Start the backtracking process.
        backtrack(nums, used, current, result);
        return result;  // Return the final list of unique permutations.
    }

    // The backtrack function generates permutations by recursively building them.
    private void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        // Base case: If the current permutation is the same length as the input array, it's a valid permutation.
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));  // Add the current valid permutation to the result list.
            return;
        }

        // Try every element in nums, one at a time.
        for (int i = 0; i < nums.length; i++) {
            // If the element has already been used in the current permutation, skip it.
            if (used[i]) {
                continue;
            }
            // Skip duplicates:
            // If the current element is the same as the previous one, and the previous element hasn't been used,
            // then we are revisiting the same element in the same level of the recursion, which would result in duplicate permutations.
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;  // Skip the current iteration to avoid generating duplicate permutations.
            }

            // Mark the current element as used and add it to the current permutation.
            used[i] = true;
            current.add(nums[i]);

            // Recur to add the next element to the permutation.
            backtrack(nums, used, current, result);

            // Backtrack: Undo the changes and explore other possibilities.
            current.remove(current.size() - 1);  // Remove the last added element.
            used[i] = false;  // Mark the element as unused, allowing it to be used in another branch.
        }
    }

    public static void main(String[] args) {
        uniquePermutationOfANumber solution = new uniquePermutationOfANumber();
        int[] nums = {1, 3, 1, 2};  // Example input array with duplicates.
        
        // Get the unique permutations
        List<List<Integer>> result = solution.permuteUnique(nums);
        
        // Print each unique permutation.
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
