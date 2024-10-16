import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class L2022212009_16_Test {

    // 测试用例设计的总体原则：
    // 1. 等价类划分：包括正常情况（数字组合能形成最大数）、边界情况（如数组中包含0或多个0）和异常情况（理论上此题无异常，但可测试空数组）。
    // 2. 边界值分析：测试数组中包含的最大、最小数字，以及它们的组合。
    // 3. 全面覆盖：尽可能覆盖所有可能的输入情况。

    @Test
    public void testNormalCase() {
        Solution solution = new Solution();
        int[] nums = {10, 2};
        String result = solution.largestNumber(nums);
        assertEquals("210", result);
    }

    @Test
    public void testWithZeros() {
        Solution solution = new Solution();
        int[] nums = {0, 0};
        String result = solution.largestNumber(nums);
        assertEquals("0", result);
    }

    @Test
    public void testWithLeadingZeros() {
        Solution solution = new Solution();
        int[] nums = {0, 3, 0};
        String result = solution.largestNumber(nums);
        assertEquals("300", result);
    }

    @Test
    public void testSingleDigit() {
        Solution solution = new Solution();
        int[] nums = {5};
        String result = solution.largestNumber(nums);
        assertEquals("5", result);
    }

    @Test
    public void testMultipleDigits() {
        Solution solution = new Solution();
        int[] nums = {3, 30, 34, 5, 9};
        String result = solution.largestNumber(nums);
        assertEquals("9534330", result);
    }

    @Test
    public void testAllSameDigits() {
        Solution solution = new Solution();
        int[] nums = {6, 6, 6};
        String result = solution.largestNumber(nums);
        assertEquals("666", result);
    }


}