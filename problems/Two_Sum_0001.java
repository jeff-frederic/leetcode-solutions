package problems;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public Solution(){};

    public int[] twoSum(int[] nums, int target) {
        /*
            HashMap() style Map() allows us to match a value to a key.
            In this case we need it to keep track of the differences.
        */
        Map<Integer, Integer> visited = new HashMap<>();
        int[] result = new int[2];      // result container creation


        // Iterate through every item in array
        for(int i=0; i<nums.length; i++){

            /*
                Taking difference between target and value at
                position i

                Ex:
                nums= {2,7,11,15}; i=0; target=9
                first_key = 7; visited = {}

                Ex: nums= {2,7,11,15}; i=1; target=9
                first_key = 2; visited = {{2,0}}
            */
            int first_key = target - nums[i];

            /*
                Checks if first_key is a number that has already
                been added to the map.
            */
            if(visited.containsKey(first_key)) {
                result = new int[]{visited.get(first_key), i};
                break;      // Exits for loop
            }

            visited.put(nums[i],i);
        }

        return result;
    }
}