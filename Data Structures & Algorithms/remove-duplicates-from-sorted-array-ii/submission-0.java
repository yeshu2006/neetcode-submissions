class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=2;
        while(j<nums.length){
            if(nums[i-1]==nums[j]){
                j++;
            }
            
            else{
                nums[++i]=nums[j++];
            }
        }
        return i+1;
    }
}