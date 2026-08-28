class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int result=0;
        int i=0;
        long sum =0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            long operations = (long) nums[j] * (j - i + 1) - sum;
             while (operations > k) {
                sum -= nums[i++];
                operations = (long) nums[j] * (j - i + 1) - sum;
            }
            result=Math.max(result,j-i+1);
        }
        return result;
    }
}