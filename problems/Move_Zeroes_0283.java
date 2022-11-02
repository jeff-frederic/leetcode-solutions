class Solution {
    public void moveZeroes(int[] nums) {
        
        // Iterate through loop
        for(int k=0, i=1; i<nums.length; i++){
          
            // Swap them 
            if(nums[k]==0 && nums[i]!=0){
                nums[k] = nums[i];
                nums[i] = 0;
                k++;
            }
            
            // Move k to nearest 0
            else if(nums[k]!=0 && nums[i]==0){k++;i--;}
        }
      
    }
}
