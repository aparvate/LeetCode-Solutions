class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> checker = new HashMap();
        for (int i= 0; i < Math.min(k+1,nums.length); i++){
            if (checker.putIfAbsent(nums[i], i) != null){
                return true;
            }
        }
        for (int i = k + 1; i < nums.length; i++){
            checker.remove(nums[i-(k+1)]);
            if (checker.putIfAbsent(nums[i], i) != null){
                return true;
            }
        }
        return false;
    }
}