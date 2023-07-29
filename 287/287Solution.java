import java.util.HashMap;

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i: nums){
            if (map.get(i) == null){
                map.put(i, i);
            }
            else{
                System.gc();
                return i;
            }
        }
        return -1;
    }
}