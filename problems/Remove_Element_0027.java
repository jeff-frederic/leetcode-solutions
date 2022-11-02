class Solution {
    public int removeElement(int[] nums, int val) {
        
        // In-place tracker
        int count = 0;
        
        // Iterate through array
        for (int i = 0; i < nums.length; i++) {
            
            // Only keep values that are not 'val'
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;        // Tells you how many values there are in the array 
                                // that are not the desired 'val'
            }
            
            // Note: Array nums will have a different order of elements,
            //      but not include that desired 'val' up until the count
            //      index.
        }
        
        return count;
    }
}
