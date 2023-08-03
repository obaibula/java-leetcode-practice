package problem011;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        var result = solution.maxArea(height);
        assertThat(result).isEqualTo(49);
    }

    @Test
    public void testCase2() {
        int[] height = {1, 1};
        var result = solution.maxArea(height);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testCase3() {
        int[] height = {200, 200, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 10, 9};
        var result = solution.maxArea(height);
        assertThat(result).isEqualTo(230);
    }
}