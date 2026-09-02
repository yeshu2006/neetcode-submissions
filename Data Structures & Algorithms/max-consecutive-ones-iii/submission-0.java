class Solution {
    public int longestOnes(int[] nums, int k) {
        int result=0;
        int sum=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==1){
                sum++;
            }
            if(nums[j]==0){
                sum++;
                k--;
            }
            while(k<0){
                if(nums[i]==0){
                    k++;
                }
                i++;
                sum--;
            }
            result=Math.max(result,sum);
        }
        return result;
    }
}