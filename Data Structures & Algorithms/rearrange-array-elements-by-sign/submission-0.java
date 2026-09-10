class Solution {
    public int[] rearrangeArray(int[] nums) {
       int count =0;
       int count2=1;
        int []result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[count]=nums[i];
                count+=2;
            }
            else{
                result[count2]=nums[i];
                count2+=2;
            }
        }
        return result;
        
    }
}