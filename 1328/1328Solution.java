class Solution {
    public String breakPalindrome(String palindrome) {
        String returnValue = "";
        if (palindrome.length() % 2 == 1){
            for (int i = 0; i < Math.ceil((palindrome.length())/2); i++){
                if (palindrome.charAt(i) != 'a'){
                    returnValue = palindrome.substring(0, i) + 'a' + palindrome.substring(i+1);
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < palindrome.length()/2; i++){
                if (palindrome.charAt(i) != 'a'){
                    returnValue = palindrome.substring(0, i) + 'a' + palindrome.substring(i+1);
                    break;
                }
            }
        }
        if (returnValue.equals("") && palindrome.length() > 1){
            returnValue = palindrome.substring(0,palindrome.length()-1) + 'b';
        }
        return returnValue;
    }
}