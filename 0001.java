class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Use a map to store differences and index
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int diff;                   // Initialize difference variable
        int[] result = new int[2];  // Initialize array

        // Iterate through nums
        for(int i=0; i<nums.length; i++){
            diff = target - nums[i];    // calculate difference

            if(!map.containsKey(diff)){ // check if difference is in map
                map.put(nums[i], i);    // not in map | place in map
            }
            else{                       // in map | set result array 
                result[0] = map.get(diff); 
                result[1] = i;
                return result;          // return array
            }
        }

        return result;                  // return is needed | otherwise missing
    }
}
