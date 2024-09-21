package Sorting;

import java.util.*;

public class Quicksort {

    public static void quicksort(int[] nums, int lb, int ub) {
        if (lb < ub) {
            int pivotindex = partition(nums, lb, ub);
            quicksort(nums, lb, pivotindex - 1);
            quicksort(nums, pivotindex + 1, ub);
        }
    }

    public static int partition(int[] nums, int lb, int ub) {
        int pivotelement = nums[lb];
        int start = lb;
        int end = ub;
        
        while (start < end) {
            // Move start pointer until a value greater or equal to the pivot is found
            while (start < ub && nums[start] <= pivotelement) {
                start++;
            }
            // Move end pointer until a value less than or equal to the pivot is found
            while (nums[end] > pivotelement) {
                end--;
            }
            if (start < end) {
                // Swap nums[start] and nums[end]
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }

        // Swap pivot element with nums[end] (the correct position of the pivot)
        int temp = nums[lb];
        nums[lb] = nums[end];
        nums[end] = temp;

        return end;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 2, 5, 7, 3, 6};

        quicksort(nums, 0, nums.length - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(nums));
    }
}
