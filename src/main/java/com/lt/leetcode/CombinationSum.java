package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. 组合总和
 * 知识点：栈、回溯
 */
public class CombinationSum {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7};
        System.out.println(combinationSum(a, 7));
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < candidates.length; i++) {
            result.clear();
            if (combinationSum(result, target, candidates)) {
                resultList.add(result);
            }
        }
        return resultList;
    }

    private static boolean combinationSum(List<Integer> realResult, int target, int[] candidates) {
        for (int i = 0; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                return false;
            }
            if (target - candidates[i] == 0) {
                realResult.add(candidates[i]);
                return true;
            }
            realResult.add(candidates[i]);
            if (combinationSum(realResult, target - candidates[i], candidates)) {
                return true;
            }
        }
        return true;
    }

}
