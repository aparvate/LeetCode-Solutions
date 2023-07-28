class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int returnValue = 0;
        while (i < chars.length) {
            int groupLength = 1;
            while (i + groupLength < chars.length && chars[i + groupLength] == chars[i]) {
                groupLength++;
            }
            chars[returnValue] = chars[i];
            returnValue++;
            if (groupLength > 1) {
                for (char c : Integer.toString(groupLength).toCharArray()) {
                    chars[returnValue] = c;
                    returnValue++;
                }
            }
            i += groupLength;
        }
        return returnValue;
    }
}