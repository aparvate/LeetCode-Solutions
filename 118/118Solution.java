class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rV = new ArrayList<>();
        List<Integer> ad = new ArrayList<>();
        if (numRows == 1){
            ad.add(1);
            rV.add(ad);
            return rV;
        }
        else{
            rV = generate(numRows-1);
            ad.add(1);
            for (int i = 1; i < rV.size(); i++){
                List<Integer> getting = rV.get(rV.size()-1);
                ad.add(getting.get(i-1) + getting.get(i));
            }
            ad.add(1);
            rV.add(ad);
            return rV;
        }
    }
}