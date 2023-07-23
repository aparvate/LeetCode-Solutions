/* Intuition
I realized quickly that the easiest way to do it was just iterating through the words, and putting them together. Then, if there were any bits left over, I could put them at the end.

# Approach
I did exactly what I said in the intuition; I got the first part of putting the words together easily, using the Math.max() function and other things. But I was having a little trouble with the second part - how would I detect which segment was bigger? I made some code for it at the end, but I think I could have made a much better solution, though it would have taken time.

# Complexity
- Time complexity: The time complexity of this is O(n).

- Space complexity: The space complexity of this is O(n) as well, though not sure. Will need to come back and optimize this!

# Code */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String returnValue = "";
        for (int i = 0; i < Math.min(word1.length(),word2.length()); i++){
            if (word1.charAt(i) != Character.MIN_VALUE){returnValue = returnValue + word1.charAt(i);}
            if (word2.charAt(i) != Character.MIN_VALUE){returnValue = returnValue + word2.charAt(i);}
        }
        if (word1.length() > word2.length()){
            returnValue = returnValue + word1.substring(word2.length());
        }
        if (word1.length() < word2.length()){
            returnValue = returnValue + word2.substring(word1.length());
        }
        return returnValue;
    }
}