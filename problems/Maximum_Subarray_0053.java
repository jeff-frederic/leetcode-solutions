
// LEETCODE #0053 - Maximum Subarray

class Solution{
    public Solution(){};

    public int maxSubArray(int[] nums){
        int max = nums[0];      // arbitrary value in array
        int res = max;          // result value; always has to hold (res >= max)

        // Iterate through every number in list, starting in 2nd position
        for(int i=1; i<nums.length; i++){
            //
            max = Math.max(max+nums[i], nums[i]);
            res = Math.max(max, res);
        }

        return res;
    }
}

// Example:
// nums = {-2,1,-3,4,-1,2,1,-5,4}
// max = -2
// res = -2
// -- inside for loop --
// i=1
// max = max(max+nums[1], nums[1]) = max((-2)+1, 1) = 1
// res = max(1, -2) = 1
// ---
// i=2
// max = max(max+nums[2], nums[2]) = max(1+(-3), -3) = 2
// res = max(2, 1) = 2
// ---
// i=3
// max = max(max+nums[3], nums[3]) = max(2+4, 4) = 6
// res = max(6, 2) = 6

// In conclusion:
// The res variable will keep the biggest running sum.