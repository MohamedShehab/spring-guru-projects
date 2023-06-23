package com.guru.spring5webapp.problemsolving;

import java.util.Arrays;
import java.util.Date;

public class TwoSum {

    public int[] checkSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum test = new TwoSum();
        int[] nums = {2,7,15,20};
        int target = 9;
        System.out.println(Arrays.toString(test.checkSum(nums, target)));

        System.out.println(new Date(new Date().getTime() + 604800000));

    }
}
