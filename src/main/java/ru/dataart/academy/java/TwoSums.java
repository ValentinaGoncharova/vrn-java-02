package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        int [] sumArray = new int[0];
        int start = 0;
        int end = nums.length - 1;
        while (start != end && start < end){
            int currentSum = nums[start] + nums[end];
            if (currentSum == target){
                sumArray = new int[2];
                sumArray[0] = nums[start];
                sumArray[1] =nums[end];
                return  sumArray;
            } else if (currentSum > target){
                end--;
            } else if (currentSum < target) {
                start++;
            }
        }
        return sumArray;

    }
}
