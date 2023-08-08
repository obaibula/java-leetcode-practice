package arrays.problem242;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testCase1() {
        var s = "321321jfd..''c1";
        var t = ".13.jd'3'12f12c";
        var result = solution.isAnagram(s, t);
        assertThat(result).isTrue();
    }

    @Test
    public void testCase2() {
        var s = "rat";
        var t = "car";
        var result = solution.isAnagram(s, t);
        assertThat(result).isFalse();
    }

    @Test
    public void testCase3() {
        var s = "ac";
        var t = "bb";
        var result = solution.isAnagram(s, t);
        assertThat(result).isFalse();
    }

    @Test
    public void testCase4() {
        var s = "a";
        var t = "ab";
        var result = solution.isAnagram(s, t);
        assertThat(result).isFalse();
    }
}