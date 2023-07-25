// This one was just about exactly taken from the editorial. I had a solution first, but it was pretty inefficient.

// # Complexity
// - Time complexity: O(N)

// - Space complexity: O(N)

// # Code
class Solution {
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public void swap(char[] chars, int x, int y){
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }

    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] sChars = s.toCharArray();
        while (start < end){
            while (start < s.length() && !isVowel(sChars[start])){
                start++;
            }
            while (end >= 0 && !isVowel(sChars[end])){
                end--;
            }
            if (start < end) {
                swap(sChars, start++, end--);
            }
        }
        return new String(sChars);
    }
}