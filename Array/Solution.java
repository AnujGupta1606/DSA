package Array;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        // Print the array with duplicates removed
        System.out.println("Array without duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 5};

        // Print the original array
        System.out.println("Original array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Remove duplicates and print the result
        solution.removeDuplicates(nums);
    }
}
