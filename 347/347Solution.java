class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {return nums;}
        int[] rV = new int[k];
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : nums){
            h.put(i, h.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue((n1, n2) -> h.get(n1) - h.get(n2));
        for (int i: h.keySet()){
            heap.add(i);
            if (heap.size() > k){heap.poll();}
        }
        for (int i = k-1; i >= 0; i--){
            rV[i] = heap.poll();
        }
        return rV;
    }
}