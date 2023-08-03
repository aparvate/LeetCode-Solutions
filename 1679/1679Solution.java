class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int returnValue = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == k){
                returnValue++;
                left++;
                right--;
            }
            else if (sum > k){
                right--;
            }
            else{
                left++;
            }
        }
        return returnValue;
    }
}