class Solution {
    public int longestConsecutive(int[] nums) {
        int rV = 0;
        int pasteToRV = 0;
        Integer behind = null;
        HashMap<Integer, Boolean> h = new HashMap<>();
        for (int i: nums){
            h.put(i, true);
        }
        Integer[] a = h.keySet().toArray(new Integer[h.keySet().size()]);
        Arrays.sort(a);
        for (Integer i : a){
            if (behind == null){
                pasteToRV = 1;
            }
            else{
                if (behind == i - 1){
                    pasteToRV++;
                }
                else{
                    pasteToRV = 1;
                }
            }
            if (pasteToRV > rV){
                rV = pasteToRV;
            }
            behind = i;
        }
        return rV;
    }
}