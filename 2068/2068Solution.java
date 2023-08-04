class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> hash = new HashMap(word1.length());
        for (char c : word1.toCharArray()){
            if (hash.putIfAbsent(c, 1) != null){
                hash.replace(c, hash.get(c), hash.get(c) + 1);
            }
        }
        for (char c : word2.toCharArray()){
            if (hash.putIfAbsent(c, -1) != null){
                hash.replace(c, hash.get(c), hash.get(c) - 1);
            }
        }
        for (Integer i : hash.values()){
            if (Math.abs(i) > 3) {
                return false;
            }
        }
        return true;
    }
}