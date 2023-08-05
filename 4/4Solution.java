class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length + nums2.length];
        int count = 0;
        for (int i : nums1){
            a[count] = i;
            count++;
        }
        for (int i : nums2){
            a[count] = i;
            count++;
        }
        Arrays.sort(a);
        if (a.length % 2 == 0){
            return ((double)a[a.length/2 - 1] + (double)a[a.length/2])/2;
        }
        else{
            return a[a.length/2];
        }
    }
}