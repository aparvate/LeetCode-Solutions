import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] returnValue = new int[nums.length];
        Arrays.fill(returnValue, 1);
        int current = 1;
        for(int i = 0; i < nums.length; i++){
            returnValue[i] *= current;
            current *= nums[i];
        }
        current = 1;
        for(int i = nums.length-1; i >= 0; i--){
            returnValue[i] *= current;
            current *= nums[i];
        }
        return returnValue;
    }
}