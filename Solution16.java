import java.util.*;
/*
 * @Description
 * 最大数
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * 示例 1：
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 */

import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        // 转换成包装类型，以便使用 Comparator
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i];
        }

        // 自定义排序规则，通过拼接字符串来比较大小
        Arrays.sort(numsArr, (x, y) -> {
            String order1 = x + "" + y;
            String order2 = y + "" + x;
            return order2.compareTo(order1); // 降序排列，使拼接后的字符串最大
        });

        // 如果排序后的数组全为0（即第一个元素是0），直接返回"0"
        if (Arrays.stream(numsArr).allMatch(num -> num == 0)) {
            return "0";
        }

        // 将排序后的数组拼接成字符串
        StringBuilder ret = new StringBuilder();
        for (int num : numsArr) {
            ret.append(num);
        }
        return ret.toString();
    }
}