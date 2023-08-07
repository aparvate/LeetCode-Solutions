class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double returnValue = 0;
        for (int i = 0; i < k; i++){
            returnValue += nums[i];
        }
        double result = returnValue;
        for (int i = k; i < nums.length; i++){
            returnValue += nums[i] - nums[i - k];
            result = Math.max(returnValue, result);
        }
        return result/k;
    }
}