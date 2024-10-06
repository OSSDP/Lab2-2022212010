import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class L2022212011_16_Test {

    // 测试用例设计原则：
    // 1. 等价类划分：将输入数据的可能值划分为若干个等价类，从每个等价类中选取代表性的值作为测试用例。
    // 2. 边界值分析：对每个等价类的边界进行测试。
    // 3. 错误猜测：基于经验猜测可能出现错误的情况，并设计测试用例。
    // 4. 正确性测试：确保在正常情况下功能正常工作。
    // 5. 异常情况测试：确保在异常输入或边界情况下程序能够正确处理。

    private Solution solution = new Solution();

    // 测试目的：验证当输入数组包含正数时，能够返回正确的最大数。
    // 测试用例：包含不同位数和相同位数的正数。
    @Test
    public void testLargestNumberWithPositiveNumbers() {
        int[] nums = {3, 30, 34, 5, 9};
        assertEquals("9534330", solution.largestNumber(nums));
    }

    // 测试目的：验证当输入数组只包含0时，能够正确返回"0"。
    // 测试用例：数组中全部元素都是0。
    @Test
    public void testLargestNumberWithAllZeros() {
        int[] nums = {0, 0};
        assertEquals("0", solution.largestNumber(nums));
    }

    // 测试目的：验证当输入数组只包含一个数字时，能够返回该数字的字符串表示。
    // 测试用例：数组中只有一个元素。
    @Test
    public void testLargestNumberWithSingleNumber() {
        int[] nums = {10};
        assertEquals("10", solution.largestNumber(nums));
    }

    // 测试目的：验证当输入数组包含多个0时，能够正确处理并返回最大数。
    // 测试用例：数组中包含多个0，但不是全部。
    @Test
    public void testLargestNumberWithMultipleZeros() {
        int[] nums = {0, 0, 1};
        assertEquals("100", solution.largestNumber(nums));
    }

    // 测试目的：验证当输入数组包含大数时，能够返回正确的最大数。
    // 测试用例：数组中包含较大的数字。
    @Test
    public void testLargestNumberWithLargeNumbers() {
        int[] nums = {3, 30, 34, 5, 9, 4, 40, 400};
        assertEquals("9544040034330", solution.largestNumber(nums));
    }
}
