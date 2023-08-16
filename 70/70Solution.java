class Solution {
    int[] fE;
    public int climbStairs(int n) {
        fE = new int[n];
        if (n >= 1){
            fE[0] = 1;
        }
        if (n >= 2){
            fE[1] = 2;
        }
        if (n > 2){
            for (int i = 2; i < fE.length; i++){
                fE[i] = fE[i-1] + fE[i-2];
            }
        }
        return fE[n-1];
    }
}