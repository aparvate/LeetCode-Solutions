class Solution {
    public String reverseWords(String s) {
        StringBuilder returnValue = new StringBuilder();
        int index = s.length();
        int last = index;
        for (int i=index-1; i>=0; i--){
            if (s.charAt(i) == ' '){
                returnValue.append(s.substring(i, last));
                last = i;
            }
        }
        returnValue.append(" "+s.substring(0,last));
        return returnValue.toString().replaceAll("  +"," ").trim();
    }
}