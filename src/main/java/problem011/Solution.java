package problem011;

public class Solution {

    public int maxArea(int[] height) {
        // todo: optimize
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                var distance = j - i;
                int currentArea;
                if(height[i] > height[j]){
                    currentArea = height[j] * distance;
                }else {
                    currentArea = height[i] * distance;
                }
                maxArea = Math.max(maxArea, currentArea);
            }
        }
        return maxArea;
    }
}
