class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result=0;
        int temp=0;
        for(int num:nums){
            if(num==0){
                temp=0;
            }
            else{
                temp++;
            }
            result=Math.max(result,temp);
        }
        return result;
    }
}