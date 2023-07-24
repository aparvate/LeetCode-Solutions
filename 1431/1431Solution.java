// # Intuition
// This problem was pretty easy. You just needed to get the maximum, and then compare the values. So I did that.

// # Approach
// I first grabbed the maximum, and then compared all values. I could have probably gotten the maximum AS I went, as it seems to have made runtime much smaller - stream iteration clearly is O(N).

// # Complexity
// - Time complexity: O(3N); one N for converting it to streams, one N for getting the max, and then one N for the for each loop.

// - Space complexity: This didn't take too much space at all, probably like O(N)

// # Code
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        ArrayList<Boolean> returnValue = new ArrayList<Boolean>();
        System.out.println(max);
        for (int a: candies){
            if (a + extraCandies >= max){returnValue.add(true);}
            else{returnValue.add(false);}
        }
        return returnValue;
    }
}