package problem217;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 1};
        var result = solution.containsDuplicate(nums);
        assertThat(result).isTrue();
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 2, 3, 4};
        var result = solution.containsDuplicate(nums);
        assertThat(result).isFalse();
    }

    @Test
    public void testCase3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        var result = solution.containsDuplicate(nums);
        assertThat(result).isTrue();
    }

}