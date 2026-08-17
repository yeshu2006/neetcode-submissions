class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        int count=0;
        for(int num:nums){
            ans[count++]=num;
        }
        for(int num:nums){
            ans[count++]=num;
        }
        return ans;
    }
}