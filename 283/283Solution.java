class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        int b = 0;
        while (a < nums.length){
            b = a;
            if (nums[a] == 0){
                while (b < nums.length && nums[b] == 0){
                    b++;
                }
                if (b >= nums.length){
                }
                else{
                    int temp = nums[b];
                    nums[b] = nums[a];
                    nums[a] = temp;
                }
            }
            a++;
        }
    }
}