package com.java_essential.kopaiev.essential.classwork.lesson5.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 5, 45, 34, 34, 234, 43, 54};
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(nums[i]);
        }

        Object[] rebuiltArray = targetList.toArray();

        System.out.println(Arrays.toString(rebuiltArray));
    }
}
