// # Intuition
// I knew that there had to be three consecutive zeros in order for a flower to be placed in the pot. So I knew that was going to be the crux of my algorithm!

// # Approach
// I basically iterated through, counting the amount of empty spaces. If there were three, I could plant a flower there! I quickly realized that there could be more than three empty spaces though, so I had to find an equation that got me the right amount. With a little testing, I did so. However, I had forgotten about the edges! If there was a zero on either end of the array, a flower could be placed there as long as there was another zero adjacent. So, I just upped the counter by one if it was there.

// # Complexity
// - Time complexity: O(N).

// - Space complexity: O(N), probably

// # Code
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countOfZeros = 1;
        if (flowerbed[0] == 0){
            countOfZeros++;
        }
        for (int i = 0; i < flowerbed.length; i++){
            if (flowerbed[i] == 0){
                countOfZeros++;
            }
            else{
                if (countOfZeros >= 3){
                    n = n - (int)Math.floor((countOfZeros/2) - 1);
                }
                countOfZeros = 1;
            }
        }
        if (flowerbed[flowerbed.length-1] == 0){
            countOfZeros++;
        }
        if (countOfZeros >= 3){
            n = n - (int)Math.floor((countOfZeros/2) - 1);
        }
        if (n <= 0){
                return true;
            }
        return false;
    }
}