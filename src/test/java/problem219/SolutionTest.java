package problem219;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        var result = solution.containsNearbyDuplicate(nums, k);
        assertThat(result).isTrue();
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        var result = solution.containsNearbyDuplicate(nums, k);
        assertThat(result).isTrue();
    }

    @Test
    public void testCase3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        var result = solution.containsNearbyDuplicate(nums, k);
        assertThat(result).isFalse();
    }

    @Test
    public void testCase4() {
        int[] nums = {4, 1, 2, 3, 1, 5};
        int k = 3;
        var result = solution.containsNearbyDuplicate(nums, k);
        assertThat(result).isTrue();
    }

}