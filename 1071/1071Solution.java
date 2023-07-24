// # Intuition
// I was having a VERY hard time with this one, for some reason. I need to work on string problems! But I knew that I had to check a substring of the string and see if it matched up.

// # Approach
// My first approach took a good deal of time; I basically just checked if the size of the substring divided the strings correctly, and then if they actually made up the word or not. It took a LOT of time. My second approach, helped greatly by the editorial, did that but easier.

// # Complexity
// - Time complexity: it's O(N), essentially

// - Space complexity: O(N) here as well

// # Code
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        for (int i = Math.min(len1, len2); i >= 1; i--){
            if (len1 % i == i || len2 % i == 0){
                String small = str1.substring(0,i);
                if (str1.replace(small, "").isEmpty() && str2.replace(small, "").isEmpty()){
                    return small;
                }
                else{}
            }
            else{}
        }
        return "";
    }
}