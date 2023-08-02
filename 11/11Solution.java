class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int returnValue = Integer.MIN_VALUE;
        while (start < end){
            if (getArea(height, start, end) > returnValue){
                returnValue = getArea(height,start,end);
            }
            if (height[start] >= height[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return returnValue;
    }

    public int getArea(int[] height, int start, int end){
        int length = end - start;
        int height2 = Math.min(height[start], height[end]);
        return length * height2;
    }
}