import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> returnValue = new HashMap();

        for (String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String putIn = new String(charArray);
            if (returnValue.containsKey(putIn)){
                returnValue.get(putIn).add(s);
            }
            else{
                returnValue.put(putIn, new ArrayList<String>());
                returnValue.get(putIn).add(s);
            }
        }
        List<List<String>> r = new ArrayList();
        returnValue.forEach((key, value) -> {
            r.add(value);
        });
        return r;
    }
}