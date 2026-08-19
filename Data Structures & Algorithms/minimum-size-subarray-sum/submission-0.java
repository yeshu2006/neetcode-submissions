class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int i=0;
       int result=Integer.MAX_VALUE;
       int sum=0;
       for(int j=0;j<nums.length;j++){
        sum=sum+nums[j];
        while(sum>=target){
          result=Math.min(j- i + 1,result);
          sum=sum-nums[i];
          i++;
        }
}
        return result==Integer.MAX_VALUE ?0 :result;
    }
}