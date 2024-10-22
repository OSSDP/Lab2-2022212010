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
class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        // 转换成包装类型，以便使用 Comparator
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i]; // 这里应该是 numsArr[i]，而不是 numsArr(i)
        }

        // 使用自定义的比较器进行排序
        Arrays.sort(numsArr, (x, y) -> {
            String xStr = x.toString();
            String yStr = y.toString();
            String xyStr = xStr + yStr;
            String yxStr = yStr + xStr;
            return yxStr.compareTo(xyStr); // 降序排序，所以返回 yxStr 和 xyStr 的比较结果
        });

        // 如果排序后的第一个元素是0，说明所有数字都是0，直接返回"0"
        if (numsArr[0] == 0) {
            return "0";
        }

        // 构建结果字符串
        StringBuilder ret = new StringBuilder();
        for (int num : numsArr) {
            ret.append(num);
        }
        return ret.toString(); // 这里应该是 ret.toString()，而不是 ret.toString（没有括号）
    }
}