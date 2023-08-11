class Solution {
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int vowelCount = 0;
        int max = 0;
        for (int i = 0; i < k; i++){
            if (isVowel(s.charAt(i))){
                vowelCount++;
            }
        }
        max = vowelCount;
        for (int i = k; i < s.length(); i++){
            if (isVowel(s.charAt(i))){
                vowelCount++;
            }
            if (isVowel(s.charAt(i-k))){
                vowelCount--;
            }
            max = Math.max(vowelCount, max);
        }
        return max;
    }
}