class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : s.toCharArray()){
            if (!h.containsKey(c)){
                h.put(c, 1);
            }
            else{
                h.replace(c, h.get(c) + 1);
            }
        }
        for (char c : t.toCharArray()){
            if (!h.containsKey(c)){
                h.put(c, -1);
            }
            else{
                h.replace(c, h.get(c) - 1);
            }
        }
        for (Map.Entry<Character, Integer> e : h.entrySet()){
            if (e.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}