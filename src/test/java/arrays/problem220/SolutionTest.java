package arrays.problem220;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 1};
        int indexDiff = 3;
        int valueDiff = 0;
        var result = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        assertThat(result).isTrue();
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        int indexDiff = 2;
        int valueDiff = 3;
        var result = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        assertThat(result).isFalse();
    }

    @Test
    public void testCase3() {
        int[] nums = {8, 7, 15, 1, 6, 1, 9, 15};
        int indexDiff = 1;
        int valueDiff = 3;
        var result = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        assertThat(result).isTrue();
    }

}