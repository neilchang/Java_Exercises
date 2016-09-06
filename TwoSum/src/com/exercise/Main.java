package com.exercise;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int ans[] = twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {

        int i1 = 0;
        int i2 = 0;
        int numOfNumbers = nums.length;
        boolean isFound = false;

        for (i1 = 0; (i1 < (numOfNumbers - 1)) && !isFound; i1++) {
            for (i2 = i1 + 1; (i2 < numOfNumbers) && !isFound; i2++) {
                if (nums[i1] + nums[i2] == target) {
                    isFound = true;
                }
            }
        }

        int[] pos = new int[2];
        pos[0] = i1 - 1;
        pos[1] = i2 - 1;

        return pos;
    }
}
